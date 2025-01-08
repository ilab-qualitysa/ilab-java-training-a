package Chapter4;

public class ReturnTypeMethods {
    static  double RATE = 0.1;
    public static void main(String[] args) {
        String msg = getMessage();
        System.out.println(isEven());
    }

    static String getMessage() {
        return "Hi, Welcome to Java Fundamentals course.";
    }

    static int getSum() {
        int sum = 0, num1, num2;
        num1 = 5;
        num2 = 6;
        sum = num1 + num2;
        return sum;
    }

    static double calcSalary() {
        int horsWorked = 50;
        return horsWorked * RATE;
    }

    static boolean isEven() {
        int number = 5;
        return number % 2 == 0;
    }
}
