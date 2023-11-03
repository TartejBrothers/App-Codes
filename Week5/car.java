import java.util.Scanner;

class carspeed{
    public int dis;
    public int time;
    public double speed(){
        return dis/time;
    }
}

public class car {
    public static void main(String [] args){
        Scanner obj1= new Scanner(System.in);
        carspeed obj= new carspeed();
        System.out.print("Enter Distance:");
        obj.dis=obj1.nextInt();
        
        System.out.print("Enter Time:");
        obj.time=obj1.nextInt();
        System.out.println("Speed :"+obj.speed());
        
    }
    
}
