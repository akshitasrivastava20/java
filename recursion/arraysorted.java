package recursion;

public class arraysorted {
    public static boolean issorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            issorted(arr, i+1);
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(issorted(arr,0));
    }
}
