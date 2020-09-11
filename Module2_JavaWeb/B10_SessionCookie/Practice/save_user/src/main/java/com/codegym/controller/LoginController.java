package com.codegym.controller;

import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("user")
public class LoginController {

    @ModelAttribute("user")
    public User setUserForm() {
        return new User();
    }

    @GetMapping("/")
    public String home(@CookieValue(value = "setUser", defaultValue = "") String setUser, Model model) {
        Cookie cookie = new Cookie("setUser", setUser);
        model.addAttribute("cookieValue", cookie);
        return "home";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user, Model model, @CookieValue(value = "setUser",
            defaultValue = "") String setUser, HttpServletResponse response, HttpServletRequest request) {
        if (user.getMail().equals("aaaaa@gmail.com") && user.getPassword().equals("11111")) {
            if (user.getMail() != null) {
                setUser = user.getMail();
            }

            Cookie cookie = new Cookie("setUser", setUser);
            cookie.setMaxAge(24 * 60 * 60);
            response.addCookie(cookie);

            Cookie[] cookies = request.getCookies();
            for (Cookie cookie1 : cookies) {
                if (cookie1.getName().equals("setUser")) {
                    model.addAttribute("cookieValue", cookie1);
                    break;
                } else {
                    cookie1.setValue("");
                    model.addAttribute("cookieValue", cookie1);
                    break;
                }
            }
            model.addAttribute("message", "login success");
        } else {
            user.setMail("");
            Cookie cookie = new Cookie("setUser", setUser);
            model.addAttribute("cookieValue", cookie);
            model.addAttribute("message", "Login failed");
        }
        return "home";
    }
}
