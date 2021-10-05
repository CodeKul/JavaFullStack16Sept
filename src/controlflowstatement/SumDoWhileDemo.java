package controlflowstatement;

import java.util.Scanner;

public class SumDoWhileDemo {

    public static void main(String[] args) {

        int num, sum = 0;
        char choose = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the value");
            num = scanner.nextInt();
            sum = sum + num;

            System.out.println("Do you want to enter next number ");
            choose = scanner.next().charAt(0);
        } while (choose == 'Y' || choose == 'y');


        System.out.println("sum is==>"+sum);
    }
}
