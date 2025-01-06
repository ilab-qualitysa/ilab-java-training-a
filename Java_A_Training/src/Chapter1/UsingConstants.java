package Chapter1;

public class UsingConstants {
    public static void main(String[] args) {
        int age;
        int birthYear;
        double salary;
        int hoursWorked;
        String name;
        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME = "iLab Quality";
        final double HOURLY_RATE = 350;
        final double TAX = 0.25;

        //Assign
        name = "Tumelo";
        birthYear = 2002;
        age = CURRENT_YEAR - birthYear;
        hoursWorked = 200;
        salary = (hoursWorked * HOURLY_RATE) - (hoursWorked * HOURLY_RATE * TAX);

        //USE
        System.out.println("=================" + COMPANY_NAME + "=========================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Salary: " + salary);

    }
}
