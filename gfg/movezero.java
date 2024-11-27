package gfg;
public class movezero {
    static void movezeroestoend(int[] arr){
         int count=0;
         for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
            while(count<arr.length){
                arr[count]=0;
            }
         }
    }
}
