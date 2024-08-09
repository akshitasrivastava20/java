package arrays;
import java.util.Scanner;

public class twodsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entyer the number of rows and columns:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int number[][]=new int[n][m]; 
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;i++){
                number[i][j]=sc.nextInt();


            }
        }
        System.out.println("enter the element to be searched:");
         int x=sc.nextInt();
         for(int i=0;i<n;i++){
            for(int j=0;j<m;i++){
                if(number[i][j]==x){
                    System.out.println("element present at:"+i+"");
                }


            }
        }

    }
    

    
}
