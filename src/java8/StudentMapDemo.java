package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StudentMapDemo {

    int id;
    String name;
    int marks;

    public StudentMapDemo(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }


    public static void main(String[] args) {

        StudentMapDemo obj1 = new StudentMapDemo(1,"Rahul",89);
        StudentMapDemo obj2 = new StudentMapDemo(2,"Rakesh",34);
        StudentMapDemo obj3 = new StudentMapDemo(3,"Ramesh",45);
        StudentMapDemo obj4 = new StudentMapDemo(4,"Suhas",34);

        List<StudentMapDemo> list = Arrays.asList(obj1,obj2,obj3,obj4);

//        Predicate<StudentMapDemo>predicate = f->f.getMarks()==34;
//        list.stream()
//                .filter(predicate)
//                .map(m->m.marks+1)
//                .forEach(System.out::println);



        list.stream()
                .sorted(Comparator.comparing(StudentMapDemo::getMarks).reversed())
                .forEach(s->{
                    System.out.println("id=>"+s.id+" name=>"+s.name+" marks=>"+s.marks);
                });

    }
}
