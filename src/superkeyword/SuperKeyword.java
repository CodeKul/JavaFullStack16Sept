package superkeyword;


//1. refer the immediate parent class instance variable
//2. refer the immediate parent class methods
//3. refer the immediate parent class constructor

public class SuperKeyword extends Object {
    int i = 89;

    public SuperKeyword() {
        System.out.println("In Super keyword Const");
    }

    public SuperKeyword(int i) {
        System.out.println("In Super keyword parameter");
    }

    public void show() {
        System.out.println("In Super demo Show");
    }
}

class A extends SuperKeyword {

    int i = 90;

    public A() {
        System.out.println("In A Const");
    }

    public A(int i) {
        super(i);
        System.out.println("In A Parameter cont");
    }

    public static void main(String[] args) {
        A obj = new A(1);
    }

    public void show() {
        super.show();
        System.out.println("i=>" + super.i);
        System.out.println("i=>" + i);
    }
}

class B extends A {

    public B() {
        System.out.println("In B const");
    }

    public static void main(String[] args) {
        B obj = new B();
    }
}