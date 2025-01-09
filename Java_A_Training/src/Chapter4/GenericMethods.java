package Chapter4;

public class GenericMethods {
    public static void main(String[] args) {
        //displayNumbers(5,7);
        //checkNameLength("Tumelo", 6);
        GenericMethods.<Integer>displayNumbers(4,6);
        GenericMethods.<Double>displayNumbers(4.3,6.0);
        GenericMethods.<Float>displayNumbers(4.3F,6.7F);
        GenericMethods.<String>displayNumbers("Sixty","five");
        GenericMethods.<String, Integer>checkNameLength("Tumelo",6);


    }

    static <T> void displayNumbers(T x, T y) {
        System.out.println("x = " + x + ", y = " + y);
    }

    static int calcSum(int num1, int num2) {
        return num1 + num2;
    }

    static double calcSum(double num1, double num2) {
        return num1 + num2;
    }

    static float calcSum(float num1, float num2) {
        return num1 + num2;
    }

    static <T1, T2> void checkNameLength(T1 name, T2 intLen) {
        System.out.println(name + " has " + intLen + " characters. " + "(" + intLen.equals(name.toString().length()) + ")");
    }
}
