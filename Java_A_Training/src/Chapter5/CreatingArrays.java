package Chapter5;

public class CreatingArrays {
    public static void main(String[] args) {
        //Array to store 5 elements
        Integer[] arrTestMarks = new Integer[5];
        //Array with initial values
        String[] arrNames = new String[] {"Mike", "Lewis", "Racheal", "Jenny"};
        Double[] arrPrices = {15.99, 16.49, 20.00, 13.50};
        Character[] arrLetters = {'A', 'E', 'I', 'O', 'U'};
        //Empty array
        Integer[] arrNumbers;

        //Assign
        arrTestMarks[0] = 89;
        arrTestMarks[1] = 79;
        arrTestMarks[2] = 90;
        arrTestMarks[3] = 73;
        arrTestMarks[4] = 86;

        arrNumbers = new Integer[3];
        arrNumbers[0] = 5;
        arrNumbers[1] = 10;
        arrNumbers[2] = 15;

        //Use
        display("Test Marks", arrTestMarks);
        display("Prices", arrPrices);
        display("Names", arrNames);
        display("Vowels", arrLetters);
    }

    static <T1, T2> void  display(T1 title, T2[] arrElements)
    {
        System.out.println("\n===================" + title + "====================");
        for(T2 e : arrElements) {
            System.out.print(e + " ");
        }
    }
}
