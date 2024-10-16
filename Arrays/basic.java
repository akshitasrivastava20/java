package Arrays;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        //syntax
        //dtatatyper[] variable name=new datatype[size];
        int[] arr=new int[5];
        //taking input for array
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr1={1,2,3,4,5};  
        System.out.println(arr[1]);
        String[] str=new String[5];
        System.out.println(str[1]); 

    }
}
