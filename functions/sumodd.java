package functions;
import java.util.Scanner;

public class sumodd {
    public static void sumofodd(int n){
        int s=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                s=s+i;
            }
        }
        System.out.println("sum off odd is:"+s);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System .in);
        System.out.println("enter the number of terms:");
        int n=sc.nextInt();
        sumofodd(n);
    }
    
}
