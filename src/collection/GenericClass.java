package collection;

public class GenericClass<T> {

    private T t;

    public void set(T t){
        this.t= t;
    }

    public T get(){
        return t;
    }

    public static void main(String[] args) {
        GenericClass<Integer> obj = new GenericClass<>();
        obj.set(12);
        System.out.println(obj.get());

        GenericClass<String> obj1 = new GenericClass<>();
        obj1.set("Pune");
        System.out.println(obj1.get());

    }

}
