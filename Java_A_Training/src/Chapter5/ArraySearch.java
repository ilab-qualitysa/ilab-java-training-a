package Chapter5;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arrNumbers = {6, 4, 12, 441, 81, 97, 34, 74, 63, 33};
        searchForNumber(63, arrNumbers);
        System.out.println("The highest number in the array is: " + getHighest(arrNumbers));
        System.out.println("The lowest number in the array is: " + getLowest(arrNumbers));
        String[] arrNames =  {"Tumelo", "Basi", "Maphalla", "West", "TumeloMaphalla"};
        System.out.println("The longest name is: " + longestName(arrNames));
    }

    static void searchForNumber(int num, int[] arrNumbers) {
        for(int i = 0; i < arrNumbers.length; i++) {
            if(num ==arrNumbers[i]) {
                System.out.println("Number: " + num + " found at position " + i);
                break;
            }

        }
    }

    static int getHighest(int[] arrNumbers) {
        int high = arrNumbers[0];
        for(int i = 1; i < arrNumbers.length; i++) {
            if(arrNumbers[i] > high) {
                high = arrNumbers[i];
            }
        }
        return high;
    }

    static int getLowest(int[] arrNumbers) {
        int lowest = arrNumbers[0];
        for(int i = 1; i < arrNumbers.length; i++) {
            if(arrNumbers[i] < lowest) {
                lowest = arrNumbers[i];
            }
        }
        return lowest;
    }

    /*Create a method that will return a name with the most mumber of characters
    from an array
     */
    static String longestName(String[] arrNames) {
        int longest = arrNames[0].length();
        int index = 0;
        for(int i = 0; i < arrNames.length; i++) {
            if(arrNames[i].length() > longest) {
                longest = arrNames[i].length();
                index = i;
            }
        }
        return arrNames[index];
    }
}
