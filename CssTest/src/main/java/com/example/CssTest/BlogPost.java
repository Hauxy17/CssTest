package com.example.CssTest;

import jakarta.persistence.*;

@Entity
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="HEADLINE")
    private String headline;

    @Column(name="TEXT")
    private String text;

//    @Column(name="FIRST_NAME")
//    private String author;

    public BlogPost(){
    }

    public BlogPost(Long id, String headline, String text) {
        this.id = id;
        this.headline = headline;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}