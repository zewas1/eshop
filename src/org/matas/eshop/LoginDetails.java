package org.matas.eshop;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class LoginDetails implements Serializable {

    public String email;
    public String password;
    //private String emailConnection;
    //private String passwordConnection;
    //int validationChecker = 0;

    public LoginDetails(String email, String password) {
        this.email = email;
        this.password = password;
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



/*
    public void Connection() {
        if (emailConnection.equalsIgnoreCase(email) && passwordConnection.equals(password)) {
            System.out.println("Login successfull");
            validationChecker = 1;
        } else {
            System.out.println("Incorrect email or password.");
            validationChecker = 1;
        }
    }
}

 */