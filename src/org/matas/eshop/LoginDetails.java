package org.matas.eshop;

public class LoginDetails {

    String email;
    String password;
    String emailConnection;
    String passwordConnection;
    int validationChecker = 0;

    public void ShowDetails() {
        System.out.println("Your email is: " + email);
        System.out.println("Your password is: " + password);
    }

    public void Connection() {
        if (emailConnection.equalsIgnoreCase(email) && passwordConnection.equals(password)) {
            System.out.println("Login successfull");
            validationChecker = 2;
        } else {
            System.out.println("Incorrect email or password.");
            validationChecker = 1;
        }
    }
}