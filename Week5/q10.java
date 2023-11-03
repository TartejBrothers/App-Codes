import java.util.Scanner;

public class q10 {
    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = new int[15];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Values in the Array:");
        for (int i = 0; i < 15; i++) {
            arr[i] = obj.nextInt();
        }
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        // printing array elements
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    }
}