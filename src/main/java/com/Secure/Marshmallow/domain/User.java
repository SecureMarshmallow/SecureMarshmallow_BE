package com.Secure.Marshmallow.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String id;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;

    public User(String username, String id, String password, String email)
    {
        this.username = username;
        this.id = id;
        this.password = password;
        this.email = email;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String gmail) {
        this.email = gmail;
    }
}
