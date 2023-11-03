import java.util.Scanner;

public class q7 {
    public static boolean res(int a, int b) {
        int s = a + b;
        int r = a - b;
        if (r < 0) {
            r = r * (-1);
        }
        if (s == 5) {
            return true;
        } else if (r == 5) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter Value 1: ");
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        System.out.print("Enter Value 2: ");
        int y = obj.nextInt();
        System.out.print("Result = " + res(x, y));
    }
}
