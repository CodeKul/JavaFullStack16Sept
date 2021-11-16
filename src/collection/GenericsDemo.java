package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        iterate(list);

        List<String> list2 = new ArrayList<>();
        list2.add("PUne");
        list2.add("Mumbai");
        list2.add("Nashik");
        iterate(list2);
    }

    private static void iterate(List<?> list) {
        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
