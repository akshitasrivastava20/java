package sorting;
import java.util.Scanner;

public class selectionsort {
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={7,8,3,1,2};
       for(int i=0;i<a.length-1;i++){
        int smallest=i;
        for(int j=i+1;j<a.length;j++){
            if(a[j]<a[smallest]){
                smallest=j;
            }
        }
        int t=a[i];
        a[i]=a[smallest];
        a[smallest]=t;
       } 
       printarray(a);
    }
    
}
//time complexity O(n^2)
