import java.util.Scanner;

public class q4 {
         static String rev(String str){
            char ch;
            String nstr="";
            for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
      return nstr;
      
}
    public static void main(String [] args){
        System.out.print("Enter A String:");
        Scanner obj= new Scanner(System.in);
        String a= obj.nextLine();
        if (a.equals(rev(a))){
            System.out.print("Yes, the string is a Palindrome");
        }
        else{
            System.out.print("No, the String is not a Palindrome");
        }
   
    }
}