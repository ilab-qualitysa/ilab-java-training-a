package Chapter3;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //The user should enter a name that is at most 3 characters long
        String name;

        do {
            System.out.print("Enter a name: ");
            name = sc.nextLine();
        }
        while (name.length() < 3);

        String response, selectedResposne;
        /*Select a fruit:
        A -Apple
        B - Banana
        M- Mango
        O - Orange
         */

        // Loop until a valid fruit option is selected
        do {
            System.out.println("Invalid selection. Please choose a valid fruit: \n" +
                    "A - Apple\n" +
                    "B - Banana\n" +
                    "M - Mango\n" +
                    "O - Orange");
            response = sc.nextLine().toUpperCase();
        }
        while (!response.equals("A") && !response.equals("B") && !response.equals("M") && !response.equals("O"));

        selectedResposne = switch (response) {
            case "A" -> "Apple";
            case "B" -> "Banana";
            case "M" -> "Mango";
            case "O" -> "Orange";
            default -> "Not available";
        };

        System.out.println("You selected: " + selectedResposne);
    }
}
