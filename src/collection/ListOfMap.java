package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMap {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Pune");
        map1.put(2, "Mumbai");
        map1.put(3, "Nashik");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Pune-2");
        map2.put(2, "Mumbai-2");
        map2.put(3, "Nashik-2");

        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "Pune-3");
        map3.put(2, "Mumbai-3");
        map3.put(3, "Nashik-3");

        List<Map<Integer, String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);

        list.forEach(s->{
            s.forEach((k,v)->{
                System.out.println(k+" "+v);
            });
            System.out.println();
        });

    }
}
