package org.launchcode.spaday.models;

public class User {

//    TO DO 1:
//    Add Validation Annotations¶
//Navigate to the User model class. Add validation annotations to ensure these conditions are satisfied:
//
//Username, password, and verify are required (they can’t be empty)
//Username is between 5 and 15 characters
//Email is optional
//If provided, the email has the format of a valid email address.
//The password is at least 6 characters lon

//    TO DO 5: As we mentioned above, we are not able to use Spring’s validation machinery to validate that the two password fields match given the setup we have here. Checking errors.hasErrors() will only tell us if there are errors in other form data fields.
//
//Last studio, we added some validation checks to make sure the password fields match. Now we have two validation sections: one for the annotation-configured validation (which checks errors.hasErrors()), and one that checks that the password fields match.
// Make sure they work in-sync with each other to properly return to the form if any of the validation conditions fail.

    private String username;
    private String email;
    private String password;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
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
