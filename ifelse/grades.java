package ifelse;
import java.util.Scanner;

public class grades {
    
    
    public static void main(String[] args) {
        float n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the grades:");
        n=sc.nextFloat();
        if(n>=90){
            System.out.println("EXCELLENT");
        }
        else if(n>=80){
            System.out.println("VERY GOOD");
        }
        else if(n>=70){
            System.out.println("GOOD");

        }
        else if(n>=60)
        {
            System.out.println("CAN DO BETTER");
        }
        else if(n>=50){
            System.out.println("AVERAGE");
        }
        else if(n>=40){
            System.out.println("BELOW AVERAGE");
        }
        else{
            System.out.println("fail");
        }

    }
}
