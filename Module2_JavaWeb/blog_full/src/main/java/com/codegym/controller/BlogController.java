package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.BlogService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    //  phuong thuc lay ve danh sach Category de chon lua category luc create new blog
    @ModelAttribute("categories")
    public List<Category> categories() {
        return categoryService.findAll();
    }

    //    phuong thuc hien thi trang chu cua ung dung
    @GetMapping("/")
    public String home() {
        return "home";
    }

    //    phuong thuc hien thi  blog list
    @GetMapping("/blogs")
    public String listBlog(@RequestParam Optional<String> key, @PageableDefault(size = 3) Pageable pageable, Model model) {
        Page<Blog> blogs;
        Sort sort = Sort.by("datePost").descending();
        pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
        if (key.isPresent()) {
            blogs = blogService.findAllByTitleContaining(key.get(), pageable);
//            model.addAttribute("key", key.get());
        } else {
            blogs = blogService.findAll(pageable);
        }
        model.addAttribute("blogs", blogs);
        return "blog/list";
    }

//    phuong thuc hien thi trang create blog
    @GetMapping("/create-blog")
    public String createBlog(Model model) {
        model.addAttribute("blog", new Blog());
        return "blog/create";
    }

//    phuong thuc create blog
    @PostMapping("/create-blog")
    public String saveBlog(@ModelAttribute Blog blog, RedirectAttributes redirect) {
//        blog.setDatePost(new Date(System.currentTimeMillis()));
        blogService.save(blog);
        redirect.addFlashAttribute("message", "New blog created successfully!");
        return "redirect:/blogs";
    }


//    phuong thuc hien thi chi tiet blog
    @GetMapping("/view-blog/{id}")
    public String viewBlog(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/view";
    }

//         phuong thuc hien thi trang edit blog
    @GetMapping("/edit-blog/{id}")
    public String editBlog(@PathVariable int id, Model model) {
        Blog num = blogService.findById(id);
        model.addAttribute("blog", blogService.findById(id));
        if( num != null) {
            return "blog/edit";
        } else {
            return "error";
        }
    }

//    phuong thuc update blog da edit
    @PostMapping("/edit-blog")
    public String updateBlog(@ModelAttribute Blog blog, RedirectAttributes redirect) {
//        blog.setDatePost(new Date(System.currentTimeMillis()));
        blogService.save(blog);
        redirect.addFlashAttribute("message", "Blog updated successfully!");
        return "redirect:/blogs";
    }

//    phuong thuc hien thi trang delete blog
    @GetMapping("/delete-blog/{id}")
    public String deleteBlog(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/delete";
    }

//    phuong thuc delete blog
    @PostMapping("/delete-blog")
    public String removeBlog(@ModelAttribute Blog blog, RedirectAttributes redirect) {
        blogService.remove(blog.getId());
        redirect.addFlashAttribute("message", "Blog deleted successfully!");
        return "redirect:/blogs";
    }
}
