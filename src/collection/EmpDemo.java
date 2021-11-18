package collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmpDemo implements Comparable<EmpDemo> {
    int id;
    String name;
    String address;

    public EmpDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        EmpDemo obj1 = new EmpDemo(1743, "Akash", "Pune");
        EmpDemo obj2 = new EmpDemo(254, "Suhas", "Pune");
        EmpDemo obj3 = new EmpDemo(543, "Ravi", "Mumbai");

        ArrayList<EmpDemo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list);
        list.forEach(s -> {
            System.out.println(s.id + " " + s.name + " " + s.address);
        });
    }

//    @Override
//    public int compareTo(EmpDemo empDemo) {
//        if (this.id == empDemo.id) {
//            return 0;
//        } else if (this.id > empDemo.id) {
//            return 67571;
//        } else {
//            return -154455;
//        }
//    }

    @Override
    public int compareTo(EmpDemo empDemo) {
        return this.name.compareTo(empDemo.name);
    }
}
