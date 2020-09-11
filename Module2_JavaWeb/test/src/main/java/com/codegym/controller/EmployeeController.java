package com.codegym.controller;

import com.codegym.entity.Employee;
import com.codegym.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

//    phuong thuc hien thi trang chu cua ung dung
    @GetMapping("/")
    public String goHome() {
        return "home";
    }

//    phuong thuc hien thi list
    @GetMapping("/listEmployee")
    public String showListEmployee(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        return "list";
    }

//    phuong thuc hien thi trang create
    @GetMapping("/createEmployee")
    public String createEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "create";
    }

//    phuong thuc create
    @PostMapping("/createEmployee")
    public String save(@Valid @ModelAttribute Employee employee, BindingResult bindingResult,
                       RedirectAttributes redirectAttributes) {
    if (bindingResult.hasFieldErrors()) {
        redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.khachHang", bindingResult);
        return "create";
    }
    employeeService.save(employee);
    redirectAttributes.addFlashAttribute("message", "New employee created successfully!");
    return "redirect:/listEmployee";
    }

//    phuong thuc delete
    @GetMapping("/deleteEmployee")
    public String delete(@RequestParam Integer id, RedirectAttributes redirectAttributes) {
        employeeService.remove(id);
        redirectAttributes.addFlashAttribute("message", "Deleted employee successfully!");
        return "redirect:/listEmployee";
    }

    @GetMapping("/search")
    public ModelAndView search(@RequestParam(name = "search") String search,
                               @RequestParam("input") String input) throws ParseException {
        List<Employee> employees=null;
        switch (search){
            case "birthday": {
                if(input != null){
                    employees = employeeService.findAllByBirthdayContaining(input);
                } else {
                    employees = employeeService.findAll();
                }
                break;
            }
            case "idCard": {
                if(input != null){
                    employees = employeeService.findAllByIdCard(input);
                } else {
                    employees = employeeService.findAll();
                }
                break;
            }
            case "id": {
                Integer id = Integer.valueOf(input);
                if(id != null){
                    employees = employeeService.findAllById(id);
                } else {
                    employees = employeeService.findAll();
                }
                break;
            }
            default:
                employees = null;
                break;
        }
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("search",search);
        modelAndView.addObject("input",input);
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }

    @GetMapping("/search-all")
    public ModelAndView search(@RequestParam(name = "value1", defaultValue = "0") Integer  value1,
                               @RequestParam(name="value2",required = false, defaultValue = "" ) String value2,
                               @RequestParam(name="value3",required = false, defaultValue = "") String value3
                              ) {
        List<Employee> employees;

        employees = employeeService.findAllByIdAndBirthdayContainingAndIdCard(value1,value2,value3);

        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("employees", employees);
        modelAndView.addObject("value1",value1);
        modelAndView.addObject("value2",value2);
        modelAndView.addObject("value3",value3);
        return modelAndView;
    }
}
