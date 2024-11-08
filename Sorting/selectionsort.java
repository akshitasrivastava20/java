package Sorting;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={23,43,12,34,32,41,21,25};
        selection(arr);
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
    }
    static void selection(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            int max=0;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
                int last=arr.length-i-1;
                int temp=arr[last];
                arr[last]=arr[max];
                arr[max]=temp;

            }
        }
    }
}
