package loops;
import java.util.Scanner;

public class sumofnatural {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum+"is sum");
    }
    
}
