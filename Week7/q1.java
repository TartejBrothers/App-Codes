import java.util.Random;
class NumberGenerator implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(100); 
            System.out.println("Generated number: " + randomNumber);

            if (randomNumber % 2 == 0) {
                EvenNumberHandler.handleEvenNumber(randomNumber);
            } else {
                OddNumberHandler.handleOddNumber(randomNumber);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenNumberHandler {
    public static void handleEvenNumber(int number) {
        int square = number * number;
        System.out.println("Square of " + number + ": " + square);
    }
}

class OddNumberHandler {
    public static void handleOddNumber(int number) {
        int cube = number * number * number;
        System.out.println("Cube of " + number + ": " + cube);
    }
}

public class q1 {
    public static void main(String[] args) {
        Thread generatorThread = new Thread(new NumberGenerator());
        Thread evenHandlerThread = new Thread(() -> {
            while (true) {
            }
        });
        Thread oddHandlerThread = new Thread(() -> {
            while (true) {
            }
        });
        generatorThread.start();
        evenHandlerThread.start();
        oddHandlerThread.start();
    }
}