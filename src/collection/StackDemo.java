package collection;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);//
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.search(Integer.valueOf(20)));
        System.out.println(stack);
        Iterator<Integer> iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
