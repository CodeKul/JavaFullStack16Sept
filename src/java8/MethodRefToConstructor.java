package java8;

public class MethodRefToConstructor {
    public static void main(String[] args) {
        //refer
        Myinterface4 myinterface4  = MyClass::new;
        //call
        myinterface4.myRef();
    }

}
class MyClass{
    MyClass(){
        System.out.println("In  my class");
    }
}

interface Myinterface4{
    MyClass myRef();
}