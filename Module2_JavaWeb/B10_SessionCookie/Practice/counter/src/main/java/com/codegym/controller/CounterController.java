package com.codegym.controller;

import com.codegym.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("counter")
public class CounterController {

    @ModelAttribute("counter")
    public Counter setCounter() {
        return new Counter();
    }

    @GetMapping("/")
    public String getCounter(@ModelAttribute Counter counter) {
        counter.increment();
        return "result";
    }
}
