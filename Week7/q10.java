class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

public class q10 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");
        MyThread thread4 = new MyThread("Thread 4");
        MyThread thread5 = new MyThread("Thread 5");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(3);
        thread3.setPriority(Thread.NORM_PRIORITY);
        thread4.setPriority(7);
        thread5.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}