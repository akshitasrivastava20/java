package recursion.Arrayrecursionproblems;
//check if arrY IS sorted or not using recursion
public class sortedarray {
    public static void main(String[] args) {
        int[] arr={12,43,56};
        boolean x=sorted(arr,0);
        System.out.println(x);
    }
    static boolean r=true;
        static boolean sorted(int[]arr,int i)
        {   if(i==arr.length-1){
            return true;
        }
         if(arr[i]>arr[i+1]){
            return false;
         }
         return(sorted(arr,i+1));
            
            // return(arr[i]<arr[i+1]&&sorted(arr, i+1));
        
    }
}
