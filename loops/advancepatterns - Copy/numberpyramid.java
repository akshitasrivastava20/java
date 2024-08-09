package loops.advancepatterns;
import java.util.Scanner;

public class numberpyramid {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;int k=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
            }
            k++;
            System.out.println();
        }
    }
}
