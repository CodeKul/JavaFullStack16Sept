package collection;

import java.util.ListIterator;
import java.util.Vector;

public class    VectorDemo {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(40);
        vector.add(40);
        vector.add(40);
        vector.add(40);
        vector.add(40);
        vector.add(40);
        vector.add(40);
        System.out.println(vector.capacity());
        vector.addElement(50);

//        System.out.println(vector.isEmpty());
//        System.out.println(vector.size());
//        System.out.println(vector.contains(20));
//        System.out.println(vector.firstElement());
//        System.out.println(vector.remove(Integer.valueOf(10)));
//        System.out.println(vector.remove(0));
//        System.out.println(vector.remove(0));
//        System.out.println(vector);

        System.out.println();
        ListIterator<Integer> listIterator = vector.listIterator(3);
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
