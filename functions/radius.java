package functions;
import java.util.Scanner;

public class radius {
    public static double circumference(int r){
       double c= 2*(3.1415)*r;
       return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius:");
        int r=sc.nextInt();
        double c= circumference(r);
        System.out.println("circumference:"+c);

        
    }
}
