package Chapter4;

import java.util.Scanner;

/*Void methods do not return any data back to the calller*/
public class VoidMethods {

    static String firstName, lastName, empNumber;
    static int age;
    static double height;

    public static void main(String[] args) {
        displayMessage();
        getUserDetails();
        displayDetails();
    }

    static void displayMessage() {
        System.out.println("Hi, Welcome to Java Fundamentals course.");
    }

    static void getUserDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter firstName: ");
        firstName = sc.nextLine();
        System.out.print("Enter lastName: ");
        lastName = sc.nextLine();
        System.out.print("Enter employee no: ");
        empNumber = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter height: ");
        height = sc.nextDouble();


    }

    static void displayDetails() {
        System.out.println("===========Details for Employee (" + empNumber + ") ===============");
        System.out.println("Fullname: " + firstName + " " + lastName);
        System.out.println("Employee No: " + empNumber);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}
