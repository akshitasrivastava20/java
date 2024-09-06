import java.util.Arrays;

public class copyOfRange {
   
        static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int copied[]=Arrays.copyOfRange(arr, 0, arr.length);
        System.out.println("original array");
        printarray(arr);
        System.out.println("copied array");
        printarray(copied);
    }
}
