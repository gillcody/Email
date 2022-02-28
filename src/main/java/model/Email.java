package model;

import java.util.Locale;
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
    private int mailboxCap = 1000;
    private String email;
    private String altEmail;
    private String companySuffix = "googill.com";

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

        //Setup the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //Setup the password
        this.password = generatePassword(passwordLength);
        System.out.println("Password: " + password);

        //Setup the email
        email = firstName.toLowerCase(Locale.ROOT) + "." + lastName.toLowerCase(Locale.ROOT) +  "@" + department.toLowerCase(Locale.ROOT) + "." + companySuffix;
        System.out.println("User email: " + email);
    }

    /**
     * Generates a random password for the user
     * @param length
     * @return
     */
    private String generatePassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_";
        char[] password = new char[length];

        for(int i = 0; i < length; i++) {
            int rand = (int)Math.random() * passwordSet.length();
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }

    public void changePassword(String password) {
        this.password = password;
    }

    /**
     * Setters
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

    public void setMailboxCap(int cap) {
        this.mailboxCap = cap;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordLength(int passwordLength) {
        this.passwordLength = passwordLength;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCompanySuffix(String companySuffix) {
        this.companySuffix = companySuffix;
    }

    /**
     * Getters
     */
    private String getDepartment() {
        return department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public int getPasswordLength() {
        return passwordLength;
    }

    public int getMailboxCap() {
        return mailboxCap;
    }

    public String getEmail() {
        return email;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public String getCompanySuffix() {
        return companySuffix;
    }
}
