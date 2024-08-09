package functions;
import java.util.Scanner;


public class avg {
    public static void average(int a,int b,int c){
        float avg=(a+b+c)/3;
        System.out.println("average is"+avg);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        average(a,b,c);

       
        
    }
}
