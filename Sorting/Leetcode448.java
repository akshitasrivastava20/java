package Sorting;

import java.util.ArrayList;
import java.util.List;

//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums
public class Leetcode448 {
    public static void main(String[] args) {
        int[] arr={1,7,4,3} ;
        
    }
    static List<Integer> findDisappearedNumbers(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int t=nums[i];
                nums[i]=nums[correct];
                nums[correct]=t;

            }
            else{
                i++;
            }

        }
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
}
