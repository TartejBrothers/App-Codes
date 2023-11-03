import java.util.Scanner;
public class q5
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word :");
        String s=sc.nextLine();
        int i,char1=0, char2=0,l=s.length(); 
        s=s.toLowerCase(); 
        for(i=0;i<l;i++)
    {
            char ch=s.charAt(i);
            if (ch>=48 && ch<=57){

                char1++;}
            if (ch>='a' && ch<='z'){
                char2++;}
        }
        System.out.println("Number of digits = "+char1);
        System.out.println("Number of letters = "+char2);
    }
}
