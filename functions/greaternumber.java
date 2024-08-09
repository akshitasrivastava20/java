package functions;
import java.util.Scanner;

public class greaternumber {
    public static int greater (int a,int b){

        if(a>b){
        return a;}
        else
        {return b;}


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= greater(a,b);
        System.out.println(c+"is greater");
    }
    
}
