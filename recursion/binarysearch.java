package recursion;

public class binarysearch {
    public static int search(int[] nums, int target,int s,int e) {
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(nums[m] == target){
            return m;
        }
        else if(nums[m]<target){
            return search(nums, target, m + 1, e);
        
        }
        else{
            return search(nums, target, s, m - 1);
        }
    }
    public static void main(String args[]){
        int[] nums={1,2,3,4,5,6};
        int target = 4;
        int start = 0;
        int end = nums.length - 1;
        System.out.println(search(nums, target, start, end));
        
    }
}

