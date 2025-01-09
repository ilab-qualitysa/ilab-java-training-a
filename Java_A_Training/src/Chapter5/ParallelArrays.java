package Chapter5;

import java.util.Scanner;

public class ParallelArrays {
    public static void main(String[] args) {
        final int SIZE = 3;
        int[] arrTestMarks = new int[SIZE];
        String[] arrStNames = new String[SIZE];

        Scanner sc = new Scanner(System.in);
        String stName;
        int testMark;

        for(int i = 0; i < SIZE; ++i)
        {
            System.out.print("Enter name for student " + (i+1)  + ": ");
            stName = sc.next();
            arrStNames[i] = stName;
            System.out.print("Enter test Mark for student " + (i+1)  + ": ");
            testMark = sc.nextInt();
            arrTestMarks[i] = testMark;
        }

        System.out.println("======================= DETAILS ===========================");
        for(int i = 0; i < SIZE; i++)
        {
            System.out.println(arrStNames[i] +  "\t" + arrTestMarks[i]);
        }
    }
}
