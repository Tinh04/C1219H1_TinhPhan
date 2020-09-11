package com.codegym.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "blog_table")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String recapitulate;
    private String content;
    private Date date;

    public Blog() {
    }

    public Blog(String title, String recapitulate, String content, Date date) {
        this.title = title;
        this.recapitulate = recapitulate;
        this.content = content;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Blog [id = %d, title = %s, recapitulate = %s, content = %s, date = %s]", id, title, recapitulate, content, date);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
