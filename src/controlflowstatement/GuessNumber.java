package controlflowstatement;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        int random = (int) (Math.random() * 100) + 1;
        System.out.println(random);
        int num;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the guess number");
            num = scanner.nextInt();
            if (random > num) {
                System.out.println("Number is grater");
            } else if (random < num) {
                System.out.println("Number is smaller");
            } else {
                System.out.println("You guess correct..!");
            }
        } while (random != num);

    }
}
