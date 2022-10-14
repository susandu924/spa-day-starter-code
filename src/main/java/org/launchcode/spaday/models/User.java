package org.launchcode.spaday.models;

import java.util.Date;

public class User {

    private String id;

    private static Integer nextId = 1;
    private String username;
    private String email;
    private String password;
    private Date joinDate;

    public User(){
        id = String.valueOf(nextId);
        nextId++;
        joinDate = new Date(System.currentTimeMillis());
    }

    public String getId() {
        return id.toString();
    }

    private void setId(String id) {
        this.id = id;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}