package java8;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * lambada  expression=> anonymous function
 * syntax -
 * ()->{ }
 * advantage ->
 * it gives implementation to functional interface
 * it take less code
 */
public class LambadaExpression {

    public static void main(String[] args) {
        MyInterface myInterface = () -> {
            return "In msg";
        };

        System.out.println(myInterface.msg());

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Consumer<Integer> consumer =  (integer)-> {
                System.out.println(integer);
        };

        list.forEach(consumer);

        MyInterface2 myInterface2 = ( i, j)-> i+j;

        System.out.println(myInterface2.add(2,3));
    }
}

@FunctionalInterface
interface MyInterface {
    String msg();
}

@FunctionalInterface
interface MyInterface2{
    Integer add(int i,int j);
}