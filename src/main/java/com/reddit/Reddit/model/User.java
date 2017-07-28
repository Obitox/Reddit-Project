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
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="email")
    private String email;
    @Column(name="icon")
    private String icon;
}
