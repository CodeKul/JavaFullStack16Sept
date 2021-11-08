package multithreading;

public class SynchronizedDemo {

     static int num;

//    public void increase() {
//        synchronized (this){
//            num++;
//        }
//    }
   public  static void increase() {
       synchronized (SynchronizedDemo.class){
           num++;
       }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo obj1 = new SynchronizedDemo();
        SynchronizedDemo obj2 = new SynchronizedDemo();

        Thread t1 = new Thread(()-> {
                for (int i = 1; i <= 1000; i++) {
                    obj1.increase();
                }
        });

        Thread t2 = new Thread(()-> {
                for (int i = 1; i <= 1000; i++) {
                    obj1.increase();
                }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                obj2.increase();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                obj2.increase();
            }
        });

        t2.start();
        t1.start();
        t3.start();
        t4.start();
        t2.join();
        t3.join();
        t4.join();
        t1.join();
        System.out.println(num);

    }
}
