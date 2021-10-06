package array;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
//        int i= 10;
        int[] arr = {1,2,44,5,5,5};
        String[] str = {"Rahul","Akash"};


//        System.out.println(Arrays.toString(arr));

//        System.out.println(arr.length);

//        System.out.println(arr[arr.length-1]);

        for(int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
        }

        for(int j = arr.length-1;j>=0;j--){
            System.out.println(arr[j]);
        }

    }
}


