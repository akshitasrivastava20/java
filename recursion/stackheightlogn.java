package recursion;
import java.util.Scanner;
public class stackheightlogn {
    public static int axe(int x,int n){
        if(n==1)
           return x;
        if(n%2==0){
           return axe(x,n/2)*axe(x,n/2);
        }
        else{
            return axe(x,n/2)*axe(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number then its power");
       int x=sc.nextInt();
       int n=sc.nextInt();
       System.out.println(axe(x,n)); 
    }
}
