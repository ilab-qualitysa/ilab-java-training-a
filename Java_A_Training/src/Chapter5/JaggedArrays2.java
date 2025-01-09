package Chapter5;

import java.util.Scanner;

public class JaggedArrays2 {
    public static void main(String[] args) {
        final int SIZE = 3;
        String[] arrNames = new String[SIZE];
        String[][] arrPersons = new String[3][];
        String[] arrHobbies;
        int hobbyCount = 0;
        String strName, strHobby;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter name for person " + (i+1) + ": ");
            strName = sc.next();
            arrNames[i] = strName;
            //ask for the number of hobbies
            System.out.print("How many hobbies for " + strName + ": ");
            hobbyCount = sc.nextInt();
            arrHobbies = new String[hobbyCount];
            for(int j = 0; j < arrHobbies.length; ++j) {
                System.out.print("Enter hobby " + (j+1) + " for " + strName + ": ");
                strHobby = sc.next();
                arrHobbies[j] = strHobby;
            }
            arrPersons[i] = arrHobbies;
        }
        System.out.println("\n===================OUTPUT===============================\n");
        for(int i = 0; i < arrPersons[i].length; i++) {
            System.out.println(arrNames[i] + "\t");
            for(int j = 0; j < arrPersons[i].length; j++) {
                System.out.println((j+1) + ". " + arrPersons[i][j]);
            }
        }
    }
}
