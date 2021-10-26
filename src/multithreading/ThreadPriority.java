package multithreading;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();

        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(10);

        obj1.start();
        obj2.start();
    }
}

class Thread1  extends Thread{
    @Override
    public void run() {
        System.out.println("In thread1 run");
    }
}

class Thread2  extends Thread{
    @Override
    public void run() {
        System.out.println("In thread2 run");
    }
}

/**
 * high = 10
 * normal= 5
 * min = 1
 *
 */