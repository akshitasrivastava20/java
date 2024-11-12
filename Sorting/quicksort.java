package Sorting;

public class quicksort {
   static void sort(int[] arr,int h,int l){
    int s=h;
    int e=l;
    int m=s+(e-s)/2;
    int pivot=arr[m];
    while(arr[s]<pivot){
        s++;
    }
    while(arr[e]>pivot){
        e--;
    }
    if(s<=e){
        int t=arr[s];
        arr[s]=arr[e];
        arr[e]=t;
        s++;
        e--;
    }
    sort(arr,h,e);
    sort(arr,s,l);

   } 
}
