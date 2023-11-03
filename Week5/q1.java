import java.util.Scanner;

public class q1 {
         static void rev(String str){
            char ch;
            String nstr="";
            for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println("Reversed word: "+ nstr);
}
    public static void main(String [] args){
        System.out.print("Enter A String:");
        Scanner obj= new Scanner(System.in);
        String a= obj.nextLine();
        rev(a);
   
    }
}