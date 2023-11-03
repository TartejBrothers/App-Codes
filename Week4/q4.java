import java.util.Scanner;
public class q4 {
    public static void main( String [] args){
        Scanner ob= new Scanner(System.in);
        System.out.print("Enter String:");
        String old= ob.nextLine();
        String newstr="";
        int i;
        for (i=0;i<old.length();i++){
            char c= old.charAt(i);
            newstr=c+newstr;
        }
        System.out.print("New String is:");
        System.out.print(newstr);
    }
}
