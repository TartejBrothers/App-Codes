import java.util.Scanner;
public class q6 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid Password :");
        String s=sc.nextLine();
        int i,char1=0, char2=0,char3=0,char4=0,char5=0,l=s.length(); 
        for(i=0;i<l;i++)
    {
            char ch=s.charAt(i);
            if (ch>=48 && ch<=57){
                    char1+=1;}
            if (ch>=65 && ch<=90){
                char2+=1;}
            if (ch>=97 && ch<=122){
                char3+=1;}
            if (ch=='#' || ch=='$' || ch=='@'){
                char4+=1;
            }
        }
        if(l>8 || l<16){
            char5+=1;
        }
        if(char1>0 && char2>0 && char3>0 && char4>0 && char5>0){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }
}
