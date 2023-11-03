
import java.util.Scanner;
public class q2 {
    public static void main(String [] args){
        Scanner ob= new Scanner(System.in);
        int num= 1+ (int)(9* Math.random());
        System.out.print("Guess The Number: ");
        int flag=0;
        int ch= ob.nextInt();
        while (flag==0){
        if(ch!=num){
            System.out.println("Wrong Choice Try Again");
            System.out.print("Guess The Number: ");
            ch= ob.nextInt();
        }
    else{
        System.out.println("Well Guessed!");
        flag=1;
    }}
    }
}