package org.example;


import org.example.admin.Zoo;

import java.util.Scanner;

public class ZooMain {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int choice = 0;

        // declare zoo object
        Zoo zooInstance = new Zoo();

        while(choice != 3) {
            // zoo console, choose if you are accessing as an admin or visitor
            System.out.println("------Welcome to the Zoo------");
            System.out.println("What would you like to access?");
            System.out.println("1. Zoo Admin Console: ");
            System.out.println("2. The Zoo");
            System.out.println("3. Exit Program");
            System.out.print("Enter your choice: ");
            choice = inputReader.nextInt();

            switch (choice) {
                case 1:
                    // add new line
                    System.out.println();
                    System.out.println("=== Welcome to the Zoo Admin Console ===");
                    // add new line
                    System.out.println();
                    System.out.println("Please log in.");
                    System.out.print("Enter username: ");
                    String username = inputReader.next();
                    System.out.print("Enter password: ");
                    String password = inputReader.next();


                    // validate if username and password is valid
                    zooInstance.validateAdminUser(username,password);

                    if (zooInstance.isAdminUserLoggedIn()) {
                        System.out.println("logged in");
                    } else {
                        System.out.println("Access Denied!");
                    }

                    // add new line
                    System.out.println();
                    break;

                case 2:
                    System.out.println("test");
                    break;


                case 3:
                    System.out.println("Exiting Program, Goodbye!");
                    break;

                default:
                    System.out.println("Invalid input try again!");
                    break;
            }
        }

    }
}