package com.codegym.services;

import com.codegym.models.BlogCategory;

import java.util.List;

public interface BlogCategoryServices {
    List<BlogCategory> findAll();
}
