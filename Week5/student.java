import java.util.Scanner;
class details{
   public int m1; 
   public int m2; 
    public int m3; 
    public int m4; 
    public int totalmarks (){
        int t= m1+m2+m3+m4;
        return t;
    }
    public int averagemarks(int av){
        int avg=av/4;
        return avg;
    }
}

public class student {
    public static void main(String [] args){
        Scanner obj1= new Scanner(System.in);
        details obj= new details();

        int i=0;
        System.out.println("Enter Values:");
        obj.m1=obj1.nextInt();
        obj.m2=obj1.nextInt();
        obj.m3=obj1.nextInt();
        obj.m4=obj1.nextInt();
        int z=obj.totalmarks();
        System.out.println("Total Marks="+z);
        int y=obj.averagemarks(z);
        System.out.println("Average Marks="+y);
    }
    
}
