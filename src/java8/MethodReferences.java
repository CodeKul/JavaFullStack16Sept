package java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        //method  references to instance method
        MethodReferences obj  = new MethodReferences();

        MyInterface3 myInterface3 = obj::display;
        System.out.println(myInterface3.msg());

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.forEach(System.out::println);
    }

    public String display(){
        return "Hiii";
    }
}

@FunctionalInterface
interface MyInterface3{
    String msg();
}
