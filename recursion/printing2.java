package recursion;
import java.util.*;
public class printing2 {
    public static void printNum(int n){
        if (n==0)
            return;
        printNum(n-1);
         System.out.println(n);    
            

    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int n=sc.nextInt();
      printNum(n);
    }
}
