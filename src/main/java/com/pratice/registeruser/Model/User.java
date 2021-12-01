package com.pratice.registeruser.Model;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    String uid;
    String name;
    String email;
    String password;
    public String getUid() {
        return uid;
    }
    public void setUid(String string) {
        this.uid = string;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public User(String uid, String name, String email, String password) {
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    @Override
    public String toString() {
        return "User [email=" + email + ", name=" + name + ", password=" + password + ", uid=" + uid + "]";
    }
    
    
}
