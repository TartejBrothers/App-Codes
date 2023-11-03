import addition.*;
import subtraction.*;

public class q9 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = addition.add.addnum(num1, num2);
        System.out.println("Sum: " + sum);
        int difference = subtraction.subtract.subtractnum(num1, num2);
        System.out.println("Difference: " + difference);
    }
}