package exceptionhandling;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        ExceptionHandlingDemo obj = new ExceptionHandlingDemo();
        obj.handle();
    }

    public void handle() {
        int i = 10;
        int j;
        System.out.println("Hii");
        System.out.println("Hello");
        System.out.println("Welcome");
        try {
            j = i / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Hii");
        System.out.println("Hello");
        System.out.println("Welcome");
    }
}
