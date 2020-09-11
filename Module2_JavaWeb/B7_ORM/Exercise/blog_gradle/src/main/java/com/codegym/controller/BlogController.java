package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.Date;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/")
    public String listBlog(Model model) {
        model.addAttribute("blogs", blogService.findAll());
        return "list";
    }

    @GetMapping("/create-blog")
    public String createBlog(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create-blog")
    public String saveBlog(Blog blog, RedirectAttributes redirect) {
        blog.setDatePost(new Date(System.currentTimeMillis()));
        blogService.save(blog);
        redirect.addFlashAttribute("message", "New blog created successfully!");
        return "redirect:/";
    }

    @GetMapping("/view-blog/{id}")
    public String viewBlog(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "view";
    }

    @GetMapping("/edit-blog/{id}")
    public String editBlog(@PathVariable int id, Model model) {
        Blog num = blogService.findById(id);
        model.addAttribute("blog", blogService.findById(id));
        if( num != null) {
            return "edit";
        } else {
            return "error";
        }
    }

    @PostMapping("/edit-blog")
    public String updateBlog(Blog blog, RedirectAttributes redirect) {
        blog.setDatePost(new Date(System.currentTimeMillis()));
        blogService.save(blog);
        redirect.addFlashAttribute("message", "Blog updated successfully!");
        return "redirect:/";
    }

    @GetMapping("/delete-blog/{id}")
    public String deleteBlog(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "delete";
    }

    @PostMapping("/delete-blog")
    public String removeBlog(Blog blog, RedirectAttributes redirect) {
        blogService.remove(blog.getId());
        redirect.addFlashAttribute("message", "Blog deleted successfully!");
        return "redirect:/";
    }
}
