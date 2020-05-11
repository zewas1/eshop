package org.matas.eshop;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PagrindinisFailas {

    public static int selection = 0;
    public static int emailValidation = 0;

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\zewas\\IdeaProjects\\e-shop\\users.txt";

        final Scanner scan = new Scanner(System.in);


        LoginDetails input = new LoginDetails();

        while (selection!= 3)
        {
            startUp();
            selection = scan.nextInt();
            if (selection == 1) {

                while (!input.email.equals("Invalid")){
                    System.out.println("Please enter a valid e-mail address to register: ");
                    input.email = scan.next();
                    emailCheck(input);
                }

                //String str = input.email;
                //char[] cArray = str.toCharArray();

                System.out.println("Create a new password (Must be at least 8 symbols): ");
                input.password = scan.next();
                passwordCheck(input);
                writeToFile(filePath, input);
                //input.ShowDetails();

                if (input.email.equals("Invalid") || input.password.equals("Invalid")) {
                    System.out.println("Please create a new account.");
                    input.password = "";
                    input.email = "";
                } else {
                    System.out.println("Registration was succesful!");
                }
            } else if (selection == 2) {
                System.out.println("Enter email to login");
                input.emailConnection = scan.next();
                System.out.println("Enter password to login");
                input.passwordConnection = scan.next();
                input.Connection();
                if (input.validationChecker == 1) {
                }
            } else if (selection == 3) {
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

    private static void writeToFile(String filePath, LoginDetails input) throws IOException {
        FileWriter myWriter = new FileWriter(filePath);
        myWriter.write(input.email + " ");
        myWriter.write(input.password + " ");
        myWriter.close();
    }

    private static void emailCheck(LoginDetails input) {
        if (EmailPatterCheck.isValid(input.email)) {
            System.out.println("Email is valid!");
        } else {
            System.out.println("Email is invalid");
            input.email = "Invalid";
        }
    }

    private static void passwordCheck(LoginDetails input) {

        if (PasswordCheck.isValid(input.password)) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Password is invalid");
            input.password = "Invalid";
        }
    }

    private static void Login(Scanner scan) {
        LoginDetails input = new LoginDetails();

    }

    private static void startUp() {
        System.out.println("Welcome to my e-shop. Please select from the following options: ");
        System.out.println("1. Register to the e-shop system");
        System.out.println("2. Login to your existing account");
        System.out.println("3. Exit the application");
    }
}