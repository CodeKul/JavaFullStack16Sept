package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer, Integer> function = f -> f * 2;

        list.stream()
                .map(function)
                .forEach(System.out::println);

        List<String> strings = Arrays.asList("Java", "is", "programming", "language");

        Function<String, String> stringFunction = s -> s.toUpperCase();

        strings.stream()
                .map(stringFunction)
                .forEach(System.out::println);
    }
}
