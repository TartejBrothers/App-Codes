public class q3 {
    public static void main(String[] args) {

        Thread myThread = new Thread(() -> {
            try {

                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread.currentThread().setName("NewThreadName");
            System.out.println("Thread name after changing: " + Thread.currentThread().getName());
        });

        myThread.setName("OriginalThreadName");


        myThread.start();

        try {

            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread name after joining: " + myThread.getName());
    }
}