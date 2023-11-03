import java.util.Scanner;

public class q9 {

    public static void combos(int[] d, int i, int length, int[] c) {
        if (i == length) {

            for (int digit : c) {
                System.out.print(digit);
            }
            System.out.println();
            return;
        }

        for (int digit : d) {
            c[i] = digit;
            combos(d, i + 1, length, c);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Digits: ");
        int n = scanner.nextInt();

        int[] d = new int[n];
        System.out.println("Enter the Digits:");
        for (int i = 0; i < n; i++) {
            d[i] = scanner.nextInt();
        }

        int cl = 3;
        int[] c = new int[cl];

        combos(d, 0, cl, c);

        scanner.close();
    }
}
