package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(123, 32, 33, 214, 65, 76, 897, 84, 94);
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
