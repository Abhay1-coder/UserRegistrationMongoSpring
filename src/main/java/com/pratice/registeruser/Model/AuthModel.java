package com.pratice.registeruser.Model;

public class AuthModel {
    String email;
    String password;
    public AuthModel(String email, String password) {
        this.email = email;
        this.password = password;
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
    @Override
    public String toString() {
        return "AuthModel [email=" + email + ", password=" + password + "]";
    }
    
    
}
