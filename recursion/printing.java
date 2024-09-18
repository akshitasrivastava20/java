package recursion;
import java.util.*;
//print numbers from 5-1
public class printing {
    public static void printNum(int n) {
        if(n==0)
          return;
        System.out.println(n); 
        printNum(n-1); 
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        printNum(n);
    }
}
