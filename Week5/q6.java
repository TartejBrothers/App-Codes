import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q6 {

    public static List<Integer> findMissingNumbers(int[] inputArray, int startRange, int endRange) {
        List<Integer> missingNumbers = new ArrayList<>();
        boolean[] found = new boolean[endRange - startRange + 1];
        for (int num : inputArray) {
            if (num >= startRange && num <= endRange) {
                found[num - startRange] = true;
            }
        }
        for (int i = 0; i < found.length; i++) {
            if (!found[i]) {
                missingNumbers.add(i + startRange);
            }
        }
        return missingNumbers;
    }
    public static void main(String[] args) {
        int[] inputArray = new int[ 10];
        System.out.print("Enter Value: ");
        Scanner obj=new Scanner(System.in);
        long num=obj.nextLong();
        int r=(int)num; 

        int len=10;
        int i,q;
        for(i=0;i<len;i++){
            q=r%10;
            inputArray[i]=q;
            r=r/10;
        }
    
        int startRange = 1;
        int endRange = 9;

        List<Integer> missingNumbers = findMissingNumbers(inputArray, startRange, endRange);

        System.out.println("Missing numbers between " + startRange + " and " + endRange + ":");
        for (int missingNum : missingNumbers) {
            System.out.print(missingNum + " ");
        }
    }
}
