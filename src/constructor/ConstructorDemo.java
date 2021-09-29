package constructor;

public class ConstructorDemo {

    /**
     * Constructor is special type of function
     * which is invoked automatically when you create object of class.
     *
     * Rule -> 1. Class name and constructor name should be same
     * 2. There should be no return type to constructor
     * 3. final, static ,synchronized keyword are not used with constructor.
     *
     * Types ->
     * parameterized constructor
     * default constructor
     *
     * advantage -> it initializes the variable to their default values
     */

    int id;
    String name;
    boolean flag;

    public ConstructorDemo() {
        System.out.println("id=> " + id + " name=>" + name + " flag=>" + flag);
    }

    public ConstructorDemo(int i) {
        System.out.println("In Parameterized Constructor");
    }

    public static void main(String[] args) {
//        ConstructorDemo obj = new ConstructorDemo(9);
        ConstructorDemo obj = new ConstructorDemo();

    }
}
