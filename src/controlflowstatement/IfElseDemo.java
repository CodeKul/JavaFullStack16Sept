package controlflowstatement;

import java.util.Scanner;

public class IfElseDemo {

    public static void main(String[] args) {

        int i = 19;
        String nationality ="Pakistan";

//        if(i > 18){
//            if(nationality=="Indian"){ //nested if
//                System.out.println("You can vote");
//            }else {
//                System.out.println("Not indian");
//            }
//        }else {
//            System.out.println("You can not vote");
//        }

        int a = 90, b = 800, c= 7000,d=90;
        if(a>b && a>c && a>d){ //ladder if
            System.out.println("a is greater");
        } else if(b>c && b>d){
            System.out.println("b is greater");
        }else if(c>d) {
            System.out.println("c is greater");
        } else {
            System.out.println("d is greater");
        }


//        int num;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the value");
//        num = scanner.nextInt();
//
//        if(num==1){
//            System.out.println("ONE");
//        }else if(num==2){
//            System.out.println("TWO");
//        }else if(num==3){
//            System.out.println("THREE");
//        }else if(num==4){
//            System.out.println("FOUR");
//        }

        int age=0;
        if(age>=18){
            System.out.println("You can vote");
        }else {
            System.out.println("You can not vote");
        }

        String str = age>18?"you can vote":"you can not vote";
        System.out.println(str);

    }
}
