package com.example.jfs_jwt.controller.dto;

public class Token {
    private final String token;

    public Token(String token) {
        this.token = token;
    }

    public String getAccessToke() {
        return token;
    }
}
