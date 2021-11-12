package collection;

import java.util.ArrayList;

public class Employee {
    int id;
    String name;
    String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee(1, "Akash", "Pune");
        Employee obj2 = new Employee(2, "Suhas", "Pune");
        Employee obj3 = new Employee(3, "Ravi", "Mumbai");

        ArrayList<Employee> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        list.forEach(s -> {
            System.out.println(s.id + " " + s.name + " " + s.address);
        });
    }
}
