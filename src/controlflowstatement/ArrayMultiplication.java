package controlflowstatement;

import java.util.Arrays;
import java.util.List;

public class ArrayMultiplication {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(5, 4, 3, 2, 1);

        int list2Size = list2.size();
        int multi=0;
//        for(int i=0;i<list1.size();i++){
//
//            multi = list1.get(i)* list2.get(list2Size-1);
//            System.out.println(multi);
//            list2Size--;
//        }

        for(int i=0,j=list2Size-1;i<list1.size() && j>=0;i++,j--){

            multi = list1.get(i)*  list2.get(j);
            System.out.println(multi);
        }

    }
}
