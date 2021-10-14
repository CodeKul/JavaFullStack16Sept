package test14oct;

public class Student {
    int rollNumber;
    String name;
    Integer contactNumber;
    Integer totalMarks;

    public Student(int rollNumber, String name, Integer contactNumber, Integer totalMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.contactNumber = contactNumber;
        this.totalMarks = totalMarks;
    }

    public void display(){
        System.out.println("roll=>"+rollNumber+"name=>"+name+"contactNumber=>"+contactNumber+"totalmarks=>"+totalMarks);
    }
}
