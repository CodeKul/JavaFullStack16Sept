package multithreading;

public class ThreadClassMethod {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().isAlive());
                System.out.println("In run");
            }
        });

        t1.setName("Thread first");
        System.out.println(t1.getName());
        System.out.println(t1.getId());
        System.out.println(t1.getPriority());
        System.out.println(t1.isDaemon());
        t1.start();
        System.out.println(t1.isAlive());
    }
}
