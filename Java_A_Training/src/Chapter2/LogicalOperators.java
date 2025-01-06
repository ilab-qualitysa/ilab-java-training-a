package Chapter2;

public class LogicalOperators
{
    public static void main(String[] args) {
        boolean a = true, b = true, c = false;
        int x = 5, y = 6, z = 3;
        boolean results;

        results = (a && b);
        System.out.println(results);
        results = (a || b);
        System.out.println(results);
        results = (a || b || c);
        System.out.println(results);
        results = (c && (a || b));
        System.out.println(results);
        results = (c || (x > z));
        System.out.println(results);
        results = (c && b || (x > x));
        System.out.println(results);
        results = ((x > y) || (c != a));
        System.out.println(results);

        /*Rules - You cannot have:
        *T || T
        * F && F
         */
    }
}
