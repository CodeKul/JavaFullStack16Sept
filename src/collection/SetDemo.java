package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set =  new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);

        System.out.println(set.remove(20));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.contains(30));
        System.out.println(set);

        System.out.println();
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(50);

        System.out.println(set1);
    }
}
