package com.example.socialmidia.Model;

public class User {
    private String id;
    private String username;
    private String fullname;
    private String bio;
    private String imageurl;

    public User(String id, String username, String fullname, String bio, String imageurl) {
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.bio = bio;
        this.imageurl = imageurl;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
