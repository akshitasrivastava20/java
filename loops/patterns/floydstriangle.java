package loops.patterns;
import java.util.Scanner;


public class floydstriangle {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of rows:");
     int n=sc.nextInt();
     int k=1;
     for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(k+" ");
            k++;
        }
        System.out.println();
     }
}
}