package multithreading;

public class DeomonThread extends Thread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        DeomonThread t1 = new DeomonThread();
        t1.setDaemon(true);
        t1.start();
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getId());
        System.out.println(t1.isDaemon());
    }

    @Override
    public void run() {

        System.out.println("In Run  method");
    }
}
