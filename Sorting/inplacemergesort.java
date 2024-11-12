package Sorting;

public class inplacemergesort {
    static void mergesort(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
       mergesort(arr,s,mid);
       mergesort(arr, mid, e);
       merge(arr, s,mid, e);

    }
    static void merge(int[] arr,int s,int m,int e){
        int[] mix=new int[e-s];

        int i=0;
        int j=m;
        int k=0;

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
            

        }
        

    }
}
