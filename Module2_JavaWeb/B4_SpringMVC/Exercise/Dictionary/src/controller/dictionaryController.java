package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class dictionaryController {
    @GetMapping("/")
    public String dictionary() {
        return "dictionary";
    }

    @GetMapping("/result")
    public String result(@RequestParam String keyword, Model model) {
        model.addAttribute("keyword", keyword);
        Map<String, String> list = new HashMap<>();
        list.put("name", "ten");
        list.put("age", "tuoi");
        list.put("gender", "gioi tinh");
        String value = list.get(keyword);
        model.addAttribute("value", value);
        return "result";
    }

}
