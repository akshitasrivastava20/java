package arrays;
import java.util.Scanner;

public class searcharray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int number[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
            
        }
        System.out.println("enter the element to be searched:");
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            if(number[i]==m){
                System.out.println("element found at:"+i);
                break;
            }
        }
    }
    
}
