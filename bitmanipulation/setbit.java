package bitmanipulation;
import java.util.Scanner;

public class setbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("enter the position to set to zero");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int num=bitmask | n;
        System.out.println(num);
        
    }
    
}
