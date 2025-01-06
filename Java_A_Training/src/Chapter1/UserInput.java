package Chapter1;

import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args) {
        //DECLARE
        int age, birthYear, hoursWorked;
        double salary;
        String name;
        char positionCode;
        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME = "iLab Quality";
        final double HOURLY_RATE = 350;
        final double TAX = 0.25;

        Scanner sc = new Scanner(System.in);

        //Assign
        System.out.println("Please enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter birth year: ");
        birthYear = sc.nextInt();
        System.out.println("Enter hours worked: ");
        hoursWorked = sc.nextInt();
        System.out.println("Please specify position code: (S - senior, J -Junior, I - Intern)T");
        positionCode = sc.next().charAt(0);

        age = CURRENT_YEAR - birthYear;
        salary = (hoursWorked * HOURLY_RATE) - (hoursWorked * HOURLY_RATE * TAX);

        //USE
        System.out.println("=================" + COMPANY_NAME + "=========================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Position code: " + positionCode);
        System.out.println("Salary: " + salary);
    }
}
