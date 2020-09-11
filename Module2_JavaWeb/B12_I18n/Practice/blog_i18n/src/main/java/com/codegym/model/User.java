package com.codegym.model;

public class User {

    private String userName;

    public User() {
    }

    public User(String user) {
        this.userName = user;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
