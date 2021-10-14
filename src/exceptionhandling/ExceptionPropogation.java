package exceptionhandling;

public class ExceptionPropogation {

    public void a(){
        int i=1/0;
    }

    public void b(){
        a();
    }

    public void  c(){
        try {
            b();
        }catch (ArithmeticException  e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ExceptionPropogation obj = new ExceptionPropogation();
        obj.c();
    }
}
