package controlflowstatement;

import java.util.Arrays;
import java.util.List;

public class ForLoopDemo {

    public static void main(String[] args) {

        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] =20;
        arr[2]= 30;
        arr[3]= 40;
//        arr[4] = 40;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(arr[i]);
            System.out.println(arr[i]);
            System.out.println(arr[i]);
        }

        for (int i : arr) {
            System.out.println(i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        List<Integer>  list = Arrays.asList(1,2,3,45,5);
        list.forEach(s->{
            System.out.println(s);
        });
        System.out.println();

        for(int i=1;i<=10;i++){
            System.out.println(i);
        }


    }
}
