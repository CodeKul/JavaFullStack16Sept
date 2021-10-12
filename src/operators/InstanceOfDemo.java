package operators;

import java.io.Serializable;

interface MyInterface {

}

public class InstanceOfDemo implements MyInterface {

    public static void main(String[] args) {
        InstanceOfDemo obj = new InstanceOfDemo();
        if (obj instanceof MyInterface) {
            obj.show();
        }
    }

    public void show() {
        System.out.println("In show");
    }
}
