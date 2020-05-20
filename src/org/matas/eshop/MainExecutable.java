package org.matas.eshop;

import javafx.scene.chart.ScatterChart;
import sun.applet.Main;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class MainExecutable {

    public static int selection = 0;
    public static int emailValidation = 0;
    final static Scanner scan = new Scanner(System.in);
    final static File filePath = new File("users.txt");
    public static HashMap<String, String> logData = new HashMap<String, String>();


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        LoginDetails login = new LoginDetails(null,null);


        while (selection != 3) {
            startUp();
            selection = scan.nextInt();
            if (selection == 1) {

                emailCheck(login);
                //String str = input.email;
                //char[] cArray = str.toCharArray();
                passwordCheck(login);
                //input.ShowDetails();
                if (login.email.equals("Invalid") || login.password.equals("Invalid")) {
                    System.out.println("Please create a new account.");
                    login.password = "";
                    login.email = "";
                } else {
                    writeToFile(login);
                    System.out.println("Registration was succesful!");
                }
            } else if (selection == 2) {
                System.out.println("Enter email to login");
                login.email = scan.next();
                System.out.println("Enter password to login");
                login.password = scan.next();
                //login.Connection();
            }
             else if (selection == 3) {
                System.out.println("Thank you for using my e-shop services! I wish you all the best.");
            } else {
                System.out.println("Unfortunately I am not programmed to do this function," +
                        " please select from the 3 available options:");
                System.out.println("1. Register to the e-shop system");
                System.out.println("2. Login to your existing account");
                System.out.println("3. Exit the application");
            }
        }
    }

    private static void writeToFile(LoginDetails login) throws IOException {
        logData.put(login.getEmail(), login.getPassword());
        FileWriter fileWriter = new FileWriter(MainExecutable.filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(String.valueOf(logData));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    private static void emailCheck(LoginDetails login) {
        do {
            System.out.println("Please enter a valid e-mail address to register: ");
            login.email = scan.next();
            if (EmailPatterCheck.isValid(login.email)) {
                System.out.println("Email is valid!");
            } else {
                System.out.println("Email is invalid");
                login.email = "Invalid";
            }
        } while (login.email.equals("Invalid"));
    }

    private static void passwordCheck(LoginDetails login) {
        do {
            System.out.println("Please enter a valid password to register (Must be at least 8 symbol): ");
            login.password = scan.next();
            if (PasswordCheck.isValid(login.password)) {
                System.out.println("Password is valid!");
            } else {
                System.out.println("Password is invalid");
                login.password = "Invalid";
            }
        } while (login.password.equals("Invalid"));
    }

    private static void startUp() {
        System.out.println("Welcome to my e-shop. Please select from the following options: ");
        System.out.println("1. Register to the e-shop system");
        System.out.println("2. Login to your existing account");
        System.out.println("3. Exit the application");
    }
}