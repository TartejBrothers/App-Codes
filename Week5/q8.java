import java.util.Scanner;

public class q8 {
    public static int count(String a) {
        return a.length();
    }

    public static void main(String[] args) {
        System.out.print("Enter String: ");
        Scanner obj = new Scanner(System.in);
        String x = obj.nextLine();
        System.out.println("Number of Characters : " + count(x));
    }
}
