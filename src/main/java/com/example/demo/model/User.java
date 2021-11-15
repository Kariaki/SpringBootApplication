package com.example.demo.model;

import java.util.UUID;

public class User {
    private final String username;

    public String getUsername() {
        return username;
    }

    public UUID getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    private final UUID id;
    private final String password;
    public User(String username, UUID id, String password) {
        this.username = username;
        this.id = id;
        this.password = password;
    }

}
