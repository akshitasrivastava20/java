package ifelse;
import java.util.Scanner;

public class straightline {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x and y coordinate of first point:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("enter the x and y coordinate of second point:");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        System.out.println("enter the x and y coordinate of third point:");
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        if((x2-x1)/(y2-y1)==(x3-x2)/(y3-y2)){
            System.out.println("points are in straight line");
        }
        else{
            System.out.println("not in straight line");
        }
    }
}
