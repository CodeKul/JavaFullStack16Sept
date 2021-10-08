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
            try {
                String str  = null;
                System.out.println(str.length());
            }catch (NullPointerException e){
                System.out.println(e);
            }
            j = i / 0;

        } catch (NumberFormatException e) {

            System.out.println("Number format Exc=>"+e);
        } catch (ArithmeticException  e){
            try {
                int[] arr = {1,2,3,44};
                System.out.println(arr[5]);
            }catch (ArrayIndexOutOfBoundsException a){
                System.out.println("Array index =>"+a);
            }

            System.out.println("Arithmetic Exc=>"+e);
        } finally {
            System.out.println("Finally block");
        }

        System.out.println("Hii");
        System.out.println("Hello");
        System.out.println("Welcome");
    }
}
