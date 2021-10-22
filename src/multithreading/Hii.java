package multithreading;

public class Hii extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hiii");
        }
    }
}

class Hello implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }
    }
}

class Multithreading {

    public static void main(String[] args) {
        Hii hi = new Hii();
        hi.start();

        Hello hello = new Hello();
        Thread t1 = new Thread(hello);
        t1.start();
    }
}
