package recursion.Arrayrecursionproblems;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr={12,34,56,67,89,90};
        int target=90;
        System.out.println(search(arr,target,0));
    }
    static boolean search(int[] arr,int target,int i){
        if(i==arr.length){
            return false;
        }
        if(arr[i]==target){
            return true;
        }
        return search(arr,target,i+1);
    }
}
