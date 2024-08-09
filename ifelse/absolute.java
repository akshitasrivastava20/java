package ifelse;
import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        if(n>0){
            System.out.println(n);}
         else
           {
            System.out.println(n*-1);
        }
    }
    
}
