package recursion;
import java.util.*;
public class factorial {
    public static int fact(int n){
        if(n==1||n==0)
          return(n);
         
       int f=n*fact(n-1); 
        return f;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        
       int f= fact(n);
       System.out.println(f);
    }
}
