package com.codegym.services.Impl;

import com.codegym.models.BlogCategory;
import com.codegym.repository.BlogCategoryRepository;
import com.codegym.services.BlogCategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogCategoryImpl implements BlogCategoryServices {
    @Autowired
    BlogCategoryRepository blogCategoryRepository;

    @Override
    public List<BlogCategory> findAll() {

        return blogCategoryRepository.findAll();
    }
}
