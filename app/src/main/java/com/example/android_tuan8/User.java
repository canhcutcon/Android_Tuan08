package com.example.android_tuan8;

public class User {
    private int id;
    private String mail,pass;
    private int happy,normal,angry;

    public User(int id, String mail, String pass, int happy, int normal, int angry) {
        this.id = id;
        this.mail = mail;
        this.pass = pass;
        this.happy = happy;
        this.normal = normal;
        this.angry = angry;
    }

    public User(String mail, String pass, int happy, int normal, int angry) {
        this.mail = mail;
        this.pass = pass;
        this.happy = happy;
        this.normal = normal;
        this.angry = angry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getHappy() {
        return happy;
    }

    public void setHappy(int happy) {
        this.happy = happy;
    }

    public int getNormal() {
        return normal;
    }

    public void setNormal(int normal) {
        this.normal = normal;
    }

    public int getAngry() {
        return angry;
    }

    public void setAngry(int angry) {
        this.angry = angry;
    }


}
