package multithreading;

public class Hii extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hiii");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Multithreading {

    public static void main(String[] args) throws InterruptedException {
        Hii hi = new Hii();
        hi.start();

        Hello hello = new Hello();
        Thread t1 = new Thread(hello);
        t1.start();

    }
}
