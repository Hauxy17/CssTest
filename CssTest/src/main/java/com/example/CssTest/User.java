package com.example.CssTest;

//
//import javax.validation.constraints.Email;
//import javax.validation.constraints.Size;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;


import jakarta.persistence.*;

@Entity(name = "USERPROFILE")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Size(min = 1)
    @Column(name="FIRST_NAME")
    private String firstName;

//    @Size(min = 1)
    @Column(name="LAST_NAME")
    private String lastName;

//    @Email
    @Column(name="EMAIL_ADDRESS")
    private String email;

//    @Size(min = 4, max = 30)
    @Column(name="USER_NAME")
    private String username;

    //    @Size(min = 8)
    @Column
    //in Book it's not on password
    private String password;

    public User() {
    }
    public User(Long id, String firstName, String lastName, String email, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
