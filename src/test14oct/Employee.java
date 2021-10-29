package test14oct;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    Integer empId;
    String empName;
    String  empAdd;
    Integer salary;

    public Employee(Integer empId, String empName, String empAdd, Integer salary) {
        this.empId = empId;
        this.empName = empName;
        this.empAdd = empAdd;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Employee employee = new Employee(1,"rahul","pune",3242);
        Employee employee1 = new Employee(1,"rahul","pune",3242);
        Employee employee2 = new Employee(1,"rahul","pune",3242);

        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);

        list.forEach(s->{
            System.out.println(s.empId+" "+ s.salary);
        });


    }
}
