package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,24,34,5,54);
        int sum =0;
        for(int i=0;i< list.size();i++){
            sum= sum+ list.get(i);
        }

        System.out.println(sum);

        Optional<Integer> res = list.stream().reduce((t1, t2)->t1+t2);
        System.out.println(res.get());

        List<String> stringList = Arrays.asList("India","Afaganistan","indoniasia","Aus");

        Optional<String>optionalS = stringList.stream().reduce((w1,w2)->(w1.length()>w2.length()?w1:w2));

        System.out.println(optionalS.get());

    }
}
