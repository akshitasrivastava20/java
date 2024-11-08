package Sorting;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr={3,4,2,1,5};
        cyclic(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                int temp=arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
    }
}
