package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeueDemo {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.addFirst(5);
        deque.addLast(25);

        System.out.println(deque.element());
        System.out.println(deque.offer(30));
        System.out.println(deque.peek());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.poll());
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirstOccurrence(30));
        System.out.println(deque);
    }
}
