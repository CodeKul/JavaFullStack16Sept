package java8;

public class MethodRefToStatic {
    public static void main(String[] args) {
        //refer
        MyInterface5  myInterface5 = MethodRefToStatic::display;
        //call
        System.out.println(myInterface5.msg());
    }

    public static String display(){
         return "Hello";
    }
}

@FunctionalInterface
interface MyInterface5{
    String msg();
}
