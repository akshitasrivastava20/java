package array2;
//taking input
import java.util.Scanner;
public class basic {
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
         }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printarray(arr);


        
    }
    
}
