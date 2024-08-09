package functions;
import java.util.Scanner;

public class factorial {
    public static void fact(int n){
        if(n<0){
            System.out.println("invalid number");
            return;
        }
         int f=1;
        for(int i=n;i>=1;i--){
            f=f*i;
        }
        System.out.println("factorial is"+f);
        return;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        fact(n);
    }
}
