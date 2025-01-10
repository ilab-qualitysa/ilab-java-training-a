package Chapter6;

import java.util.Scanner;

public class DebugExercise9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter License: ");
        String s = scanner.next();
        scanner.close();

        if (s.length() >= 6) {
            
            char c1 = s.charAt(1); 
            char c2 = s.charAt(4);
            char c3 = s.charAt(5);

            System.out.println("" + c1 + c2 + c3);
        } else {
            
            System.out.println("Invalid indices"); 
        }
    }
}