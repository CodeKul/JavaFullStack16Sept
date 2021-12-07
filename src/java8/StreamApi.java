package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Stream api=> stream is sequence of object
 * which have many methods and that methods we can combine and produce desired result
 *
 * types ->  sequential  and parallel(multithreading env)
 *
 * operation=> terminal and intermediate
 * terminal => forEach(),reduce(),collect()
 * intermediate=> map(Function),filter(predicate),sorted();
 *
 * */
public class StreamApi {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> predicate = (integer) -> integer>5;

        List<Integer>list1 = list
                .stream()
                .filter(predicate)
                .collect(Collectors.toList());

        System.out.println(list1);

        List<String> strings = Arrays.asList("Java","is","programming","language");

        Predicate<String >predicate1 = p->p.startsWith("J");

        strings.stream()
                .filter(predicate1)
                .forEach(System.out::println);
    }
}
