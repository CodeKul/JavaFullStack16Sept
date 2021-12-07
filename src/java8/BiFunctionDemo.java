package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> odd = ((list1, integerPredicate) -> {
                    List<Integer> res = new ArrayList<>();
                    for (Integer i : list1) {
                        if (integerPredicate.test(i)) {
                            res.add(i);
                        }
                    }
                    return res;
                });

        Predicate<Integer>predicate = p->p%2!=0;
        System.out.println(odd.apply(list,predicate));
    }
}
