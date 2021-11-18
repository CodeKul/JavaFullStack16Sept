package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    int id;
    String name;
    String address;

    public ComparatorDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        ComparatorDemo obj2 = new ComparatorDemo(254, "Suhas", "Pune");
        ComparatorDemo obj3 = new ComparatorDemo(254, "Sujeet", "Mumbai");
        ComparatorDemo obj1 = new ComparatorDemo(1743, "Akash", "Pune");
        ArrayList<ComparatorDemo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Comparator<ComparatorDemo> comparatorId = (comparatorDemo, t1) ->{
                if(comparatorDemo.id==t1.id){
                    return 0;
                }else if(comparatorDemo.id>t1.id){
                    return 1;
                }else {
                    return -1;
                }
        };

        Collections.sort(list,comparatorId.thenComparing((comparatorDemo,  t1) ->{
            return comparatorDemo.name.compareTo(t1.name);
        }).thenComparing(ComparatorDemo::getAddress));
        list.forEach(s -> {
            System.out.println(s.id + " " + s.name + " " + s.address);
        });
    }
}
