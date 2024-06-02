package com.advantech.powermanagement.user.data;

import jakarta.persistence.*;

public class User {
    @Id
    @GeneratedValue
    private String id;
    private String password;
    private String username;
    private String email;
    private String phoneNumber;

    public User(String id, String password, String username, String email, String phoneNumber) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
