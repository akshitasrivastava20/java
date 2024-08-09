package arrays;
import java.util.Scanner;


public class marks {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       System.out.println("enter the size:");
       int n=sc.nextInt();
       int marks[]=new int[n];
       System.out.println("enter the marks:");
       for(int i=0;i<n;i++){
        marks[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
        System.out.println(marks[i]);
       }
    }
    
}
