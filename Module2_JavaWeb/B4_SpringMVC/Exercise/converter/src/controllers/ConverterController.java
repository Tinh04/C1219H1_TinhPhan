package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @GetMapping("/convert")
    public String index() {
        return "index";
    }

    @GetMapping("/result")
    public String convert(@RequestParam float rate, @RequestParam float usd, Model model) {
        float vnd = rate * usd;

        model.addAttribute("rate", rate);
        model.addAttribute("usd", usd);
        model.addAttribute("vnd", vnd);

        return "result";
    }
}
