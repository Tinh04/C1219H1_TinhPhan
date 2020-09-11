package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.SandwichService;

import java.util.Arrays;
import java.util.Optional;

@Controller
public class SandwichController {

    @Autowired
    private SandwichService sandwichService;

    @RequestMapping("/")
    public String sandwich() {
        return "home";
    }


//    @RequestMapping("/sandwich")
//    public String save(@RequestParam Optional<String[]> condiment, Model model) {
//        if (condiment.isPresent()) {
//            model.addAttribute("condiments", sandwichService.save(condiment.get()));
//        } else {
//            model.addAttribute("message", "don't have");
//        }
//        return "result";
//    }

    @RequestMapping("/sandwich")
    public ModelAndView save(@RequestParam(value = "condiment", required = false) String[] condiment) {

        ModelAndView modelAndView = new ModelAndView("result");
        if (condiment != null) {
            modelAndView.addObject("condiments", Arrays.toString(condiment));
        } else {
            modelAndView.addObject("message", "don't have");
        }
        return modelAndView;
    }
}
