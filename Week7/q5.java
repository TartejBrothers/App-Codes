class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println("User thread is running.");
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("User thread finished.");
    }
}

public class q5 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        UserThread userThread = new UserThread();
        userThread.start();

        System.out.println("Main thread is running.");
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread finished.");
        try {
            userThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
