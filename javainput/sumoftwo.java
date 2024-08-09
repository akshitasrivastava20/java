package javainput;
import java.util.Scanner;

public class sumoftwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int a,b,S;
        System.out.println("enter two number:");
        a=sc.nextInt();
        b=sc.nextInt();
        S=a+b;
        
        System.out.println("sum is:"+S);

    }
    
}
