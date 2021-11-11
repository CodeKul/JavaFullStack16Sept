package collection;

import java.lang.reflect.Field;
import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) throws Exception {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 2;
        arr[3] = 3;

//        arr[4] = 4;


        List<Integer> list = new ArrayList<>();
        list.add(12);//0
        list.add(20);//1
        list.add(30);//2
        list.add(40);//3
        list.add(50);//3
        list.add(60);//3

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(getCapacity(list));

//        List<String> stringList = new ArrayList<>();
//        stringList.add("Pune");
//        stringList.add("Mumbai");
//        stringList.add("Nashik");

//        System.out.println(stringList.get("Pune"));
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(50);
//        list1.add(60);
//        System.out.println(list.get(1));
//        System.out.println(list.remove(1));
//        System.out.println(list.size());
//        System.out.println(list.contains(60));
//        System.out.println(list.isEmpty());
//        list.addAll(list1);

//        System.out.println(list);
//        list.forEach(s->{
//            System.out.println(s);
//        });

//        Iterator iterator = list.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(22);

        List<Integer> list5 = new ArrayList<>(Arrays.asList(12312, 23, 123, 23, 213));;

        List<Integer> list3 = new ArrayList<>(List.of(12, 3, 434));

        List<Integer> list4 = new ArrayList<>() {{
            add(12);
            add(34);
        }};

        List<Integer> list6 = Arrays.asList(12312, 23, 123, 23, 213);
    }

    static int getCapacity(List al) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
}
