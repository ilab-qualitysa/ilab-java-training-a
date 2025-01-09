package Chapter5;

import java.util.Scanner;

public class MutliDimensionalArray {
    public static void main(String[] args) {
        final int ROW = 2;
        final int COLS = 3;
        //Creating a 2D array
        int[][] arrTestMarks = new int[ROW][COLS];
        String[] arrStNames = new String[ROW];
        Scanner sc = new Scanner(System.in);
        String stName;
        int testMark;
        System.out.println(arrTestMarks.length);

        /*0  1  2
          78 96 80  1
          74 88 87  2
         *
        arrTestMarks[0][0] = 78;
        arrTestMarks[0][1] = 96;
        arrTestMarks[0][2] = 80;
        arrTestMarks[1][0] = 74;
        arrTestMarks[1][1] = 88;
        arrTestMarks[1][2] = 87;*/

        for(int i = 0; i < arrTestMarks.length; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            stName = sc.next();
            arrStNames[i] = stName;
            //get 3 tests
            for (int j = 0; j < COLS; j++) {
                System.out.print("Enter Test " + (j+1) + " for " + stName + ": ");
                testMark = sc.nextInt();
                arrTestMarks[i][j] = testMark;
            }
        }

        System.out.println("Name \t Test1     \tTest2     \tTest3  \tAverage  \tResult");
        for(int i = 0; i < arrTestMarks.length; i++)
        {
            double sum = 0.0, avarage = 0.0;
            System.out.print(arrStNames[i]);
            for(int j = 0; j < arrTestMarks[i].length; j++) {
                System.out.print("\t " + arrTestMarks[i][j] + " \t");
                sum += arrTestMarks[i][j];
            }
            avarage = Math.round(sum / COLS);
            System.out.println(avarage + "    \t" + (avarage >= 60 ? "Pass" : "Fail"));
            System.out.println("");
        }
    }
}
