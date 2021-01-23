package com.example.ilcaro.qa.model;

public class User {
    private  String email;
    private  String firstName;
    private  String surName;
    private  String pswd;

//    public User(String email, String firstName, String surName, String pswd) {
//        this.email = email;
//        this.firstName = firstName;
//        this.surName = surName;
//        this.pswd = pswd;
//    }


    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    public User  withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User withSurName(String surName) {
        this.surName = surName;
        return this;
    }

    public User withPswd(String pswd) {
        this.pswd = pswd;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPswd() {
        return pswd;
    }
}
