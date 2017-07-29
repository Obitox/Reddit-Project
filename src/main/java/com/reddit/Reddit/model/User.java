package com.reddit.Reddit.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
public @Data class User {
    @GeneratedValue
    @Id
    @Column(name = "iduser")
    private int id;
    private String username;
    private String password;
    private String email;
    private String icon;
}
