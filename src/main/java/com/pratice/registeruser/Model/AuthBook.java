package com.pratice.registeruser.Model;

public class AuthBook {
    String name;
    String author;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public AuthBook(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString() {
        return "AuthBook [author=" + author + ", name=" + name + "]";
    }

    
    
}
