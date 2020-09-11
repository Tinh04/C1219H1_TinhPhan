package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_blog")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "recapitulate")
    private String recapitulate;

    @Column(name = "content")
    private String content;

    @Column(name = "date_post")
    private String datePost;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Blog() {
    }

    public Blog(String title, String recapitulate, String content, String datePost) {
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

    public String getDatePost() {
        return datePost;
    }

    public void setDatePost(String datePost) {
        this.datePost = datePost;
    }
}
