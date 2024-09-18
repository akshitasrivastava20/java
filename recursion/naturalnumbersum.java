package recursion;
import java.util.*;
public class naturalnumbersum {
    
    public static void sumnatural(int n,int s){
          
        if(n==0)
         {System.out.println("sum is"+s);
         return;}
        s=s+n;
        sumnatural(n-1,s);
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of");
        int n=sc.nextInt();
        int s=0;
        sumnatural(n,s);
    }
}
