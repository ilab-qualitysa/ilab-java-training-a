package Chapter1;

public class GetStarted {
    public static void main(String[] args) {
        System.out.println("Welcome To Java Training");
        //
        //Declare
        int age;
        double height;
        float salary;
        boolean isContractor;
        String name;
        char position; //(S - senior, J -Junior, I - Intern)

        //Assign
        age = 30;
        height = 1.78;
        salary = 23000.78F;
        isContractor = true;
        name = "Tumelo Maphalla";
        position = 'I';

        //Use
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Salary: " + salary);
        System.out.println("Position Code: " + position);
    }
}
