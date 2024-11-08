package Sorting;
//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
public class Leetcode645 {
    static int[] findErrorNums(int[] nums){
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
        int[] arr=new int[2];
        for(int j=0;j<nums.length;j++){
           if(nums[j]!=j+1){
            arr[0] = nums[j];
            arr[1] = j + 1;
           
          
           }
        }
       return arr; 
    }
    
}
