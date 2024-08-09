package functions;
import java.util.Scanner;

public class sumoftwo {
    public static int sum(int x,int y){
        return x+y;
    }
    public static int product(int x,int y){
        return x*y;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sum(a,b);
        int p=product(a,b);
        System.out.println("sum is"+n);
        System.out.println("product is"+p);
    }
}
