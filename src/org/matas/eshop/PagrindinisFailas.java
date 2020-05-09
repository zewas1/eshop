package org.matas.eshop;

// loop for password retry. (check)
// cannot login? find out why (check)
// refactor where possible
//

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PagrindinisFailas {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\zewas\\IdeaProjects\\e-shop\\users.txt";

        Scanner scan = new Scanner(System.in);

        startUp();
        int selection = 0;


        do {
            selection = scan.nextInt();
            if (selection == 1) {
                System.out.println("Please enter a valid e-mail address to register: ");
                LoginDetails input = new LoginDetails();
                input.email = scan.next();
                //String str = input.email;
                //char[] cArray = str.toCharArray();

                emailCheck(input);

                System.out.println("Create a new password (Must be at least 8 symbols): ");
                input.password = scan.next();

                passwordCheck(input);

                writeToFile(filePath, input);

                //input.ShowDetails();
                if (input.email.equals("Invalid") || input.password.equals("Invalid")) {
                    System.out.println("Please create a new account.");
                    input.password = "";
                    input.email = "";
                    startUp();
                } else {
                    System.out.println("Enter email to login");
                    input.emailConnection = scan.next();
                    System.out.println("Enter password to login");
                    input.passwordConnection = scan.next();
                    input.Connection();
                    if (input.validationChecker == 1) {
                        startUp();
                    }
                }
            }
             /*
             else if (selection == 2) {
                System.out.println("Enter email to login");
                input.emailConnection = scan.next();
                System.out.println("Enter password to login");
                input.passwordConnection = scan.next();
                input.Connection();
                if (input.validationChecker == 1){
                    startUp();
                }
            }
              */
            else if (selection == 3) {
                System.out.println("Thank you for using my e-shop services! I wish you all the best.");
            } else {
                System.out.println("Unfortunately I am not programmed to do this function, please select from the 3 available options:");
                System.out.println("1. Register to the e-shop system");
                System.out.println("2. Login to your existing account");
                System.out.println("3. Exit the application");
            }
        } while (selection != 3);
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