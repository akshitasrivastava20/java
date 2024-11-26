package gfg;

public class secondlargest {
    static int getSecondLargest(int[] arr) {
        if(arr.length<2){
            return -1;
        }
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
                
            }
            else if(arr[i]>second && arr[i]!=largest){
                second=arr[i];
            }
        }
        if(second==Integer.MIN_VALUE){
            return -1;
        } else {
            return second;
        }
    }
}
