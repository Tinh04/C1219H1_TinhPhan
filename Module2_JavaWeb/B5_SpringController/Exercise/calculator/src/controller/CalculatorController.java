package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CalculatorService;

@Controller
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("operand1") double operand1, @RequestParam("operand2") double operand2,
                            @RequestParam("operator") String operator, Model model) {

        String result = String.valueOf(calculatorService.Calculate(operand1, operand2, operator));

        model.addAttribute("operand1", operand1);
        model.addAttribute("operand2", operand2);
        model.addAttribute("operator", operator);
        model.addAttribute("result", result);
        if (result.equals("operation can't divide")) {
            model.addAttribute("message", result);
            return "error";
        }
        return "result";
    }
}
