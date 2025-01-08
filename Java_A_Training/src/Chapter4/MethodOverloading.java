package Chapter4;

/*Method overloading is creating multiple methods
with the same name but different parameter list
 */
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Sum: " + calcSum(3,4,3));
        System.out.println("Total: " + sum(1,2,3,4,5));
        formatNames("Tumelo", "Maphalla", "Basi", "West");
    }

    static int calcSum(int num1, int num2) {
        return num1 + num2;
    }

    static int calcSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    /*Create methods to calculate:
    1 - sum of two integers
    2 - sum of two doubles
    3 - sum of two floating point numbers
     */

    static double calcSum(double num1, double num2) {
        return num1 + num2;
    }

    static float calcSum(float num1, float num2) {
        return num1 + num2;
    }

    static int sum(int... numbers) {
        int total = 0;
        for(int num : numbers) {
            total += num;
        }
        return total;
    }

    static void formatNames(String... names) {
        for(String name : names) {
            System.out.println("[" + name + "]");
        }
    }
}
