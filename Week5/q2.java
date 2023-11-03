import java.util.Scanner;

public class q2 {
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
            System.out.print("Yes, they are Rotationally equal");
        }
        else{
            System.out.print("No, they are not Rotationally equal");
        }
   
    }
}