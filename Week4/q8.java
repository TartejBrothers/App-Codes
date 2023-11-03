import java.util.Scanner;
public class q8 {
    public static void main(String [] args){
        System.out.print("Enter a month: ");
        Scanner obj= new Scanner(System.in);
        String mon=obj.next();
        mon=mon.toLowerCase();
        if(mon.compareTo("january")==0 || mon.compareTo("march")==0 || mon.compareTo("may")==0 || mon.compareTo("july")==0 || mon.compareTo("august")==0 || mon.compareTo("october")==0 || mon.compareTo("december")==0){
            System.out.println("It has 31 Days");
        } 
        else if (mon.compareTo("april")==0 || mon.compareTo("june")==0 || mon.compareTo("september")==0 || mon.compareTo("november")==0){
            System.out.println("It has 30 Days");
        }
        else if(mon.compareTo("february")==0){
            System.out.println("It has 28 Days");
        }

    }
}
