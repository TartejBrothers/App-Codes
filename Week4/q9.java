import java.util.Scanner;
public class q9 {
    public static void main(String [] args){
        int x;
        int y;

        Scanner obj= new Scanner(System.in);
        System.out.print("Enter Number 1:");
        x=obj.nextInt();
        System.out.print("Enter Number 2:");
        y=obj.nextInt();
        int sum=x+y;
        if (sum>=105 && sum<=200){
            System.out.println("Sum is 200");
        }
        else{
            System.out.println("Sum is "+sum);
        }
    }
}
