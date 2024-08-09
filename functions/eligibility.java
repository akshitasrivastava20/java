package functions;
import java.util.Scanner;
public class eligibility {
    public static String eligible(int a){
        if(a<18){
            return("not eligible");

        }
        else{
            return("eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age:");
        int a=sc.nextInt();
        String s=eligible(a);
        System.out.println(s);
    }
}
