class CustomThread extends Thread {
    private long sleepDuration;

    public CustomThread(long sleepDuration) {
        this.sleepDuration = sleepDuration;
    }

    public void run() {
        try {
            Thread.sleep(sleepDuration);
            System.out.println(
                    "Thread " + Thread.currentThread().getName() + " slept for " + sleepDuration + " milliseconds.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class q9 {
    public static void main(String[] args) {
        long[] sleepDurations = { 10, 20, 50, 70, 100 };

        for (int i = 0; i < sleepDurations.length; i++) {
            CustomThread customThread = new CustomThread(sleepDurations[i]);
            customThread.start();
        }
    }
}
