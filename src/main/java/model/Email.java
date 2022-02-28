package model;

import java.util.Scanner;

/**
 * @author Cody Gill
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int passwordLength = 10;
    private String department;
    private int mailboxCap;
    private String altEmail;

    public Email() {
        super();
    }

    /**
     * Set up a new email
     * @param firstName
     * @param lastName
     */
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("First Name: " + firstName + "\tLast Name: " + lastName);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = generatePassword(passwordLength);
        System.out.println("Password: " + password);
    }

    private String getDepartment() {
        return department;
    }

    /**
     * Set the department
     * @return
     */
    private String setDepartment() {
        System.out.print("Please enter your department\n" +
                "1 for Sales\n" +
                "2 for Development\n" +
                "3 for Accounting\n" +
                "0 for None\n" +
                "Enter code here: ");
        Scanner scnr = new Scanner(System.in);
        int deptChoice = scnr.nextInt();

        if(deptChoice == 1) {
            return "Sales";
        }
        else if(deptChoice == 2) {
            return "Development";
        }
        else if(deptChoice == 3) {
            return "Accounting";
        }
        else {
            return "";
        }
    }

    private String generatePassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_";
        char[] password = new char[length];

        for(int i = 0; i < length; i++) {
            int rand = (int)Math.random() * passwordSet.length();
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }
}
