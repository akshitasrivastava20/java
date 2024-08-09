package bitmanipulation;
import java.util.Scanner;

public class getbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("enter the position to get");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        if((bitmask & n)==0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was 1");
        }
        
    }
    
}
