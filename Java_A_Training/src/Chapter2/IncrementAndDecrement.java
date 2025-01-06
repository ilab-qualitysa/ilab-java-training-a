package Chapter2;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int age = 25;
        System.out.println("============================INCREMENT=============================================");
        System.out.println("Original age is " + age);
        System.out.println("Age changed to: " + ++age);
        System.out.println("Age changed again to: " + age++);
        System.out.println("Another change for age: " + age++);

        age = 25;
        System.out.println("============================INCREMENT=============================================");
        System.out.println("Original age is " + age);
        System.out.println("Age changed to: " + --age);
        System.out.println("Age changed again to: " + age--);
        System.out.println("Another change for age: " + age--);

    }
}
