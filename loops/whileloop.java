package loops;
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms ");
        int n=sc.nextInt();
        int num=1,sum=0;
        while(num<=n){
            System.out.println(num);
            sum=sum+num;
            num++;
        }
        System.out.println("sum is"+sum);
        
    }
    
}
