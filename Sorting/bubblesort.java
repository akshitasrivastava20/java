package Sorting;

import java.util.Arrays;

public class bubblesort {
    
    public static void main(String args[]){
     int[] arr={1,3,4,2,5,8,6};
     bubble(arr);
     
     
    }
    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
           swapped=false;
            for(int j=1;j<arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                    swapped=true;
                }
            }
            if(swapped ==false)
            {
                break;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}
