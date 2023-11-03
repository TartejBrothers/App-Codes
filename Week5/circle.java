import java.util.Scanner;

class properties{
    public int radius;
    public double area(){
        return 3.14*radius*radius;
    }
    public double circum(){
        return 2*3.14*radius;
    } 

}
public class circle {
    public static void main(String [] args){
        Scanner obj1= new Scanner(System.in);
        properties obj= new properties();
        System.out.print("Enter Radius:");
        obj.radius=obj1.nextInt();
        System.out.println("Circumference:"+ obj.circum());
        System.out.println("Area:"+ obj.area());
    
}}
