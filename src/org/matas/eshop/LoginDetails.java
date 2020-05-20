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

/*
    public void Connection() throws IOException {
        FileReader fileReader = new FileReader(MainExecutable.filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        boolean currentLine;

        while (currentLine = bufferedReader.readLine() != null){
            for (int i = 0, i < MainExecutable.logData.)
        }
    }

 */
}

