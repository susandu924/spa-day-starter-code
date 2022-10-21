package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {


    @Size(message = "Name must be between 5-15 characters.", min = 5, max = 15)
    @NotBlank(message = "Name must be filled in!")
    private String username;
    @Email(message = "Invalid email.")
    private String email;


    @Size(message = "Password length needs to be at least 6 characters long.", min = 6)
    @NotBlank(message = "Password required!")
    private String password;

    @NotBlank(message = "Passwords do not match!")
    private String verifyPassword;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }


//    Add a new method, private void checkPassword,
//    that compares password and verifyPassword. If neither is null and they don’t match, then set verifyPassword = null.

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

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
