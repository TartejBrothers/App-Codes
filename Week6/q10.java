import java.util.Arrays;
import bubble.*;
import selection.*;

public class q10 {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        bubble.bubblesort.sort(arr);
        System.out.println("Sorted using Bubble Sort: " + Arrays.toString(arr));

        int[] arr2 = { 64, 34, 25, 12, 22, 11, 90 };
        selection.selectionsort.sort(arr2);
        System.out.println("Sorted using Selection Sort: " + Arrays.toString(arr2));
    }
}

