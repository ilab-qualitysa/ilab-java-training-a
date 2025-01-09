package Chapter5;

import java.util.Random;

public class ArrayManipulation {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrNumbers = new int[20];
        int odd = 0, even = 0;

        // Fill arrNumbers with random numbers
        for(int i = 0; i < arrNumbers.length; i++) {
            int number = random.nextInt(66) + 10;
            arrNumbers[i] = number;
            if(arrNumbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Odd: " + odd + " Even: " + even);

        int[] arrEven = new int[even];
        int[] arrOdd = new int[odd];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int arrNumber : arrNumbers) {
            if (arrNumber % 2 == 0) {
                arrEven[evenIndex] = arrNumber;
                evenIndex++;
            } else {
                arrOdd[oddIndex] = arrNumber;
                oddIndex++;
            }
        }

        System.out.print("Initial array: ");
        displayArray(arrNumbers);
        System.out.print("Even numbers: ");
        displayArray(arrEven);
        System.out.print("Odd numbers: ");
        displayArray(arrOdd);
    }

    static void displayArray(int[] arrnum) {
        for(int j = 0; j < arrnum.length; j++) {
            System.out.print(arrnum[j] + " ");
        }
        System.out.println();
    }
}
