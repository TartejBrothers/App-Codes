import java.util.Scanner;

class UserThreadPriority extends Thread {
    private String k;
    private char c;

    public UserThreadPriority(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
        System.out.println("k: " + k);
        System.out.println("c: " + c);
    }

    public void setVariables(String k, char c) {
        this.k = k;
        this.c = c;
    }
}

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserThreadPriority threadobj1 = new UserThreadPriority("ThreadA");
        UserThreadPriority threadobj2 = new UserThreadPriority("ThreadB");
        System.out.print("Enter a String (k): ");
        String k = scanner.nextLine();

        System.out.print("Enter a Character (c): ");
        char c = scanner.next().charAt(0);
        threadobj1.setVariables(k, c);
        threadobj2.setVariables(k, c);
        threadobj1.start();
        threadobj2.start();
        scanner.close();
    }
}
