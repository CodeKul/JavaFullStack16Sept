package question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Integer floor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        floor = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        while (floor != 0) {
            int i = floor % 2;
            list.add(i);
            floor = floor / 2;
        }
        System.out.println(list);
//        String binaryNumber = Integer.toBinaryString(floor);
//        char[] arr = binaryNumber.toCharArray();
//        System.out.println(binaryNumber);

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
