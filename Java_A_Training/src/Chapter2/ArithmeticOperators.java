package Chapter2;

public class ArithmeticOperators
{
    public static void main(String[] args)
    {
        int sum, product, difference;
        double quotient, remainder;

        sum = 5 + 7;
        product = 5 * 7;
        difference = 5 - 7;
        quotient = 5 / 7.0;
        remainder = 5 % 7;

        System.out.println("Sum: " + sum + "\nProduct: " + product +
                "\nDifference: " + difference + "\nQuotient: " + quotient +
                "\nRemainder: " + remainder);
    }
}
