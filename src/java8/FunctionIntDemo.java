package java8;

import java.util.function.Function;

public class FunctionIntDemo {
    public static void main(String[] args) {

        Function<String,Integer> function  = s -> s.length();
        Function<Integer,Integer> function1 = s  -> s*2;

        System.out.println(function.andThen(function1).apply("welcome"));
    }
}
