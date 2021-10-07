package statickeyword;

public class OuterClass {

    public static void main(String[] args) {

        OuterClass obj = new OuterClass();
        obj.show();

        OuterClass.InnerClass obj1 = new OuterClass.InnerClass();
        obj1.innerShow();

    }

    public void show() {
        System.out.println("Outer class");
    }

    static private class InnerClass {

        public static void main(String[] args) {
            InnerClass obj = new InnerClass();
            obj.innerShow();
        }

        public void innerShow() {
            System.out.println("Inner class");
        }
    }

}
