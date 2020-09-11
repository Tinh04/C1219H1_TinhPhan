package com.codegym.repository;

import com.codegym.models.BlogCategory;
import com.codegym.models.BlogPost;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Locale;

public interface BlogCategoryRepository extends JpaRepository<BlogCategory,Integer> {

}
