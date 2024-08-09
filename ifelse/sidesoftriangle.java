package ifelse;
import java.util.Scanner;

public class sidesoftriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sides :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a+b)>c&&(b+c)>a&&(c+a)>b){
            System.out.println("sides of triangle");
        }
        else{
            System.out.println("not sides of triangle");
        }
    }
    
}
