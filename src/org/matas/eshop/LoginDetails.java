package org.matas.eshop;

import sun.applet.Main;
import sun.rmi.runtime.Log;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

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
    public void Connection() throws IOException, ClassNotFoundException {


            try {
                FileInputStream fis = new FileInputStream(MainExecutable.filePath);
                ObjectInputStream ois = new ObjectInputStream(fis);
                MainExecutable.userNames=(List<Object>)ois.readObject();

                for (int i = 0; i<MainExecutable.userNames.size(); i++) {
                    MainExecutable.userNames.get(i).

                }
                    if (this.email.equalsIgnoreCase(login.getEmail()) && this.password.equals(login.getPassword())) {
                        System.out.println("Login successfull");
                    } else {
                        System.out.println("Incorrect email or password.");
                    }

            }
        }
    }
}
*/
