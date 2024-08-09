package arrays;
import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and columns:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int number[][]=new int[n][m];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                number[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print
                (number[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
