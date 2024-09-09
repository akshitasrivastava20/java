package array2;
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows then columns");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();


            }
        }
        System.out.println("enter the number to be searched");
        int x=sc.nextInt();
           for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==x)
                System.out.println("element present at:("+[i]+", "+[j]")");

                

            }
            System.out.println();
        }
    }
    
}
