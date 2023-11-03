interface Sortable {
    void sort(int[] arr);
}
class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

public class q6 {
    public static void main(String[] args) {
        int[] arr1 = { 5, 2, 9, 1, 5 };
        int[] arr2 = { 8, 3, 6, 2, 7 };

        Sortable bubbleSort = new BubbleSort();
        Sortable selectionSort = new SelectionSort();

        System.out.println("Before Bubble Sort:");
        printArray(arr1);
        bubbleSort.sort(arr1);
        System.out.println("After Bubble Sort:");
        printArray(arr1);

        System.out.println("Before Selection Sort:");
        printArray(arr2);
        selectionSort.sort(arr2);
        System.out.println("After Selection Sort:");
        printArray(arr2);
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
