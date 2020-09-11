package com.codegym.controllers;

import com.codegym.models.BlogCategory;
import com.codegym.models.BlogPost;
import com.codegym.services.BlogCategoryServices;
import com.codegym.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@RestController
public class BlogRestController {
    @Autowired
    BlogCategoryServices blogCategoryServices;

    @Autowired
    BlogServices blogServices;

    @GetMapping("/getListCategory")
    public ResponseEntity<List<BlogCategory>> getListCategory() {
        List<BlogCategory> categoryList = blogCategoryServices.findAll();
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping("/getListBlogPost")
    public ResponseEntity<List<BlogPost>> getBlogPostList() {
        List<BlogPost> blogPostList = blogServices.findAll();
        return new ResponseEntity<>(blogPostList, HttpStatus.OK);
    }

    @GetMapping("/getListBlogPostByCategory")
    public ResponseEntity<List<BlogPost>> getListBlogPostByCategory(@RequestParam Integer id) {
        List<BlogPost> blogPostList = blogServices.findByBlogCategory_Id(id);
        return new ResponseEntity<>(blogPostList, HttpStatus.OK);
    }

    @GetMapping("/getDetailPost/{id}")
    public ResponseEntity<BlogPost> getDetailPost(@PathVariable Integer id) {
        Optional<BlogPost> blogPost = blogServices.findById(id);
        if (blogPost.isPresent()) {
            return new ResponseEntity<>(blogPost.get(), HttpStatus.OK);
        } else return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }
}
