package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(230);
        list.add(50);
//
//        list.addFirst(5);
//        list.addLast(45);

//        System.out.println(list.size());
//        System.out.println(list.get(1));

//        System.out.println(list.peek());
//        System.out.println(list.pop());
//        System.out.println(list.poll());
//        System.out.println(list.remove(1));

        list.clear();
//        Collections.sort(list);

        Iterator iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        System.out.println(list);
    }
}
