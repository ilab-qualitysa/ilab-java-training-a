package Chapter4;

public class GenericMethods {
    public static void main(String[] args) {
        //displayNumbers(5,7);
        checkNameLength("Tumelo", 6);
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

    static void checkNameLength(String name, int intLen) {
        System.out.println(name + " has " + intLen + " characters. " + "(" + (name.length() == intLen) + ")");
    }
}
