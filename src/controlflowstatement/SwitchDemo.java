package controlflowstatement;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {
        String num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.next();

        switch (num) {
            case "1":
                System.out.println("ONE");
                break;
            case "2":
                System.out.println("TWO");
                break;
            case "3":
                System.out.println("THREE");
                break;
            case "4":
                System.out.println("FOUR");
                break;
            default:
                System.out.println("IN-CORRECT");
        }
    }
}
