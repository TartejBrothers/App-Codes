import java.util.concurrent.Semaphore;
class Printer {
    private Semaphore semaphore = new Semaphore(1);
    public void print(String job, int order) throws InterruptedException {
        semaphore.acquire();
        System.out.println("Printing Job " + job + " (Order " + order + ")");
        Thread.sleep(1000);
        semaphore.release();
    }
}
class PrintJob implements Runnable {
    private Printer printer;
    private String job;
    private int order;
    public PrintJob(Printer printer, String job, int order) {
        this.printer = printer;
        this.job = job;
        this.order = order;
    }
    @Override
    public void run() {
        try {
            printer.print(job, order);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
public class q6 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            String job = "A" + (i + 1);
            threads[i] = new Thread(new PrintJob(printer, job, i + 1));
        }
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}