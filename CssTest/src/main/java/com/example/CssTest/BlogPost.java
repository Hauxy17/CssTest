package com.example.CssTest;

import jakarta.persistence.*;

@Entity(name = "BLOGPOST")
public class BlogPost {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="HEADLINE")
    private String headline;

    @Column(name="BLOGPOSTTEXT")
    private String blogposttext;

//    @Column(name="FIRST_NAME")
//    private String author;

    public BlogPost(){
    }

    public BlogPost(Long id, String headline, String blogposttext) {
        this.id = id;
        this.headline = headline;
        this.blogposttext = blogposttext;
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
        return blogposttext;
    }

    public void setText(String text) {
        this.blogposttext = blogposttext;
    }
}
