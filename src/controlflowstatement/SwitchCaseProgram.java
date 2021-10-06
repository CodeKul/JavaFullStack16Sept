package controlflowstatement;

import java.util.Scanner;

public class SwitchCaseProgram {

    public static void main(String[] args) {

        int num1, num2;
        char ch = 'y';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number");
        num1 = scanner.nextInt();
        System.out.println("Second  number");
        num2 = scanner.nextInt();
        System.out.println("Enter operator");
        ch = scanner.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }

    }
}
