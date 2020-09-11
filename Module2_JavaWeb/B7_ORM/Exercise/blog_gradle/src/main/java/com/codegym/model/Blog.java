package com.codegym.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "blog_table")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String recapitulate;
    private String content;
    private Date datePost;

    public Blog() {
    }

    public Blog(String title, String recapitulate, String content, Date datePost) {
        this.title = title;
        this.recapitulate = recapitulate;
        this.content = content;
        this.datePost = datePost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRecapitulate() {
        return recapitulate;
    }

    public void setRecapitulate(String recapitulate) {
        this.recapitulate = recapitulate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDatePost() {
        return datePost;
    }

    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }
}
