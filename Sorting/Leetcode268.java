package Sorting;
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array

public class Leetcode268 {
    public static void main(String[] args) {
    int[] arr={3,0,1};
    System.out.println(missingnumber(arr));

    }
   static int missingnumber(int[] arr){
    
    int i=0;
    while(i<arr.length){
        int correct=arr[i];
        if(arr[i]<arr.length &&arr[i]!=arr[correct] ){
            int t=arr[i];
            arr[i]=arr[correct];
            arr[correct]=t;
        }
        else{
            i++;
        }
    }
    for(int j=0;j<arr.length;j++){
        if(arr[j]!=j){
           
            return j;    
        }
        }
        int n = arr.length;
        return n;
    }


  
}
