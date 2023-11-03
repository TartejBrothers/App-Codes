import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = scanner.nextInt();
        double result = 0;
        switch (choice) {
            case 1:
                result = performOperation(num1, num2, "add");
                break;
            case 2:
                result = performOperation(num1, num2, "subtract");
                break;
            case 3:
                result = performOperation(num1, num2, "multiply");
                break;
            case 4:
                if (num2 != 0) {
                    result = performOperation(num1, num2, "divide");
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Result: " + result);
        scanner.close();
    }

    public static double performOperation(double num1, double num2, String operation) {
        switch (operation) {
            case "add":
                return num1 + num2;
            case "subtract":
                return num1 - num2;
            case "multiply":
                return num1 * num2;
            case "divide":
                return num1 / num2;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}
