package Sorting;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr={23,21,12,45,43,53,32};
        insertion(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
