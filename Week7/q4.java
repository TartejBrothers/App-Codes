public class q4 {
    public static void main(String[] args) {

        Thread myThread = new Thread(() -> {
            for (int i = 5; i >= 1; i--) {
                try {

                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Thread.currentThread().setName("Thread-" + i);
                System.out.println("Thread name: " + Thread.currentThread().getName());
            }
        });

        myThread.start();

        try {

            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread name after joining: " + myThread.getName());
    }
}
