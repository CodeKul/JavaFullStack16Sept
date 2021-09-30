package statickeyword;

public class StaticKeywordDemo {

    static final String companyName = "Abc";
    int id;
    String name;

    static {
//        companyName = "XYZ";
        System.out.println("In static block");
    }

    public StaticKeywordDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public static void show(){
        System.out.println("In show");
    }

    public static void main(String[] args) {

        StaticKeywordDemo obj = new StaticKeywordDemo(1, "Suhas");
        StaticKeywordDemo obj1 = new StaticKeywordDemo(2, "Akash");
        StaticKeywordDemo obj2 = new StaticKeywordDemo(3, "Rahul");

        obj.display();
        obj1.display();
        obj2.display();
//        System.out.println(companyName);
//        System.out.println(id);

        StaticKeywordDemo.show();
    }

    public void display() {
        System.out.println("id=> " + id + " name=> " + name + " company Name=> " + companyName);
    }
}
