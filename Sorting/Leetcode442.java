package Sorting;

import java.util.ArrayList;
import java.util.List;

//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
public class Leetcode442 {
    static  List<Integer> findDuplicates(int[] nums) {
        int i=0;
        List<Integer> ans=new ArrayList<>();
        while(i<nums.length){
            if(nums[i]!=i+1){
                int correct=nums[i]-1;

                if(nums[correct]!=nums[i]){
                    int t=nums[i];
                    nums[i]=nums[correct];
                    nums[correct]=t;
            
                }
                else{
                    ans.add(nums[i]);
                   
                   
                }
            }
            else{
                i++;
            }
        }
        return(ans);
    }
}
