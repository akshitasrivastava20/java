package javainput;
import java.util.Scanner;

public class circlearea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r;double a;
        System.out.println("enter the radius:5");
        r=sc.nextInt();
        a=3.1415*r*r;
        System.out.println("area of circle is:"+a);

        
    }
    
}
