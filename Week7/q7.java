class ThreadA extends Thread {
    private String input;
    private int digitCount;
    public ThreadA(String input) {
        this.input = input;
        this.digitCount = 0;
    }
    @Override
    public void run() {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        System.out.println("ThreadA:" + digitCount);
    }
}
class ThreadB extends Thread {
    private String input;
    private int charCount;
    public ThreadB(String input) {
        this.input = input;
        this.charCount = 0;
    }
    @Override
    public void run() {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                charCount++;
            }
        }
        System.out.println("ThreadB:" + charCount);
    }
}
public class q7 {
    public static void main(String[] args) {
        String k = "Hello123World456";
        ThreadA threadA = new ThreadA(k);
        ThreadB threadB = new ThreadB(k);
        threadA.start();
        threadB.start();
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}