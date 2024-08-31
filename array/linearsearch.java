package array;

import java.util.*;

class search{
      int linearsearch(int n){
             
            int arr[]={45,23,34,54};
            for(int i=0;i<arr.length;i++){
                if(arr[i]==n){
                  return i;
              }
            }
            return -1;
          }
}

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
       
        System.out.println("enter element to be searched");
        int x=sc.nextInt();
      search obj=new search();
       int y=obj.linearsearch(x);
       if(y!=-1){
        System.out.println("element found");
       }
       else{
        System.out.println("not found");
       }
       
    }
}
