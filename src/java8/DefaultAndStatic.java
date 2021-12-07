package java8;

public class DefaultAndStatic implements MyInterface6{
    public static void main(String[] args) {

        DefaultAndStatic obj   = new DefaultAndStatic();
        System.out.println(obj.str());
        System.out.println(obj.add(9,8));
        System.out.println(MyInterface6.sub(5,2));
    }

    @Override
    public String str() {
        return "Hii";
    }
}

interface MyInterface6{

    String str();

    default int add(int a,int b){
        return a+b;
    };

    static int sub(int a,int b){
        return a-b;
    }

}
