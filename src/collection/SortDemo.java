package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(104324);
        integers.add(104);
        integers.add(1430);
        integers.add(140);

        Collections.sort(integers,Collections.reverseOrder());

        System.out.println(integers);

    }

}
