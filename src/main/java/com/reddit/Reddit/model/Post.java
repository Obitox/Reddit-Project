package com.reddit.Reddit.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Post {
    @GeneratedValue
    @Id
    @Column(name = "idpost")
    private int id;
    private int vote;
    private String title;
    private String username;
    private String thumbnail;
    @Column(name = "post_link")
    private String postLink;
    @Column(name="date_posted")
    private String date;
}