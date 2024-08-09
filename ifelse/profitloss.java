package ifelse;
import java.util.Scanner;


public class profitloss {
    public static void main(String[] args) {
        float cp,sp,t,profit=0,loss=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cost price of item:");
        cp=sc.nextFloat();
        System.out.println("enter the sellin price of item:");
        sp=sc.nextFloat();
        t=sp-cp;
        if(t>0){
            System.out.println("seller has made profit of :");
            System.out.println(t);

    
        }
        else if(t<0){
            System.out.println("seller is in loss of:");
            System.out.println(-t);        }
        else{
            System.out.println("neither profit nor loss");
        }

        
    }
    
}
