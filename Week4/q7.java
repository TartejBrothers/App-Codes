public class q7 {
    public static void main(String [] args){
        int i,x,y,z=0,q=0;
        for (i=100;i<=400;i++){
            if(i%2==0){
                x=i/10;
                if(x%2==0){
                    y=x/10;
                    if(y%2==0){
                        z=i;
                        String num=Integer.toString(z);
                        for (q=0;q<num.length();q++){
                            System.out.print(num.charAt(q));
                            if(q!=num.length()-1){
                                System.out.print(",");
                            }
                        }
                        System.out.println("");
}}}} }}
