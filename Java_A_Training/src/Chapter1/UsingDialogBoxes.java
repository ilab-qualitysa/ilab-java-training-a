package Chapter1;

import javax.swing.*;

/*
*Get input from the user using dialog boxes
*from the JOption Pane class
 */
public class UsingDialogBoxes {
    public static void main(String[] args) {
        //Declare
        int age, birthYear, hoursWorked;
        double salary;
        String name, strOutput;
        char positionCode;
        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME = "iLab Quality";
        final double HOURLY_RATE = 350;
        final double TAX = 0.25;

        //Assign
        name = JOptionPane.showInputDialog("Please enter your name: ");
        birthYear = Integer.parseInt(JOptionPane.showInputDialog("Enter birth year: "));
        hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter hours worked: "));
        positionCode = JOptionPane.showInputDialog("Please specify position code: (S - senior, J -Junior, I - Intern)T").charAt(0);

        age = CURRENT_YEAR - birthYear;
        salary = hoursWorked * HOURLY_RATE * (1 - TAX);

        strOutput = "=================" + COMPANY_NAME + "=========================\n" + "Name: " + name + "\nAge: "
                + age + "\nHours worked: " + hoursWorked + "\nSalary: " + salary + "\nPosition Code: " + positionCode;

        //USE
        JOptionPane.showMessageDialog(null, strOutput);


    }
}
