package test14oct;

public class TernaryOperator {
    public static void main(String[] args) {

        int age= 17;
        if(age>18){
            System.out.println("you can vote");
        }else {
            System.out.println("you cant vote");
        }

        String str  =  age>18?"you can vote":"you cant vote";

    }
}
