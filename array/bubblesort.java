package array;

public class bubblesort {
    public static void main(String[] args) {
       int arr[]={7,8,3,1,2};
       int t;
       int smallest;
       //bubblesort
       //time complexity=O(n^2)
    //    for(int i=0;i<arr.length-1;i++){
    //     for(int j=0;j<arr.length-i-1;j++){
    //       if(arr[j]>arr[j+1]){
    //          t=arr[j];
    //          arr[j]=arr[j+1];
    //          arr[j+1]=t;
    //       }

    //     }
    //    }

    // //selection sort
    // //timecompleity=O(n^2)
    // for(int i=0;i<arr.length-1;i++){
    //     smallest=i;
    //     for(int j=i+1;j<=arr.length-1;j++){
    //         if(arr[smallest]>arr[j]){
    //             smallest=j;
    //         }
    //     }
    //     t=arr[i];
    //     arr[i]=arr[smallest];
    //     arr[smallest]=t;

    // }
    //insertion sort
    
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       } 

    }
}
