import java.util.Scanner;

public class q3 {
    public static void even(int arr[]){
       int i=0;
       System.out.println("Even Values in the Array: ");
        for (i=0; i<5 ; i++){
            if(arr[i]%2==0){{
                System.out.println(arr[i]);
            }}
        }
    }
    public static void main(String [] args){
        int [] arr= new int[5];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Values of the Array:");
        int i=0;
        for (i=0; i<5 ; i++){
            arr[i]=obj.nextInt();
        }
        even(arr);
    }    
}   
