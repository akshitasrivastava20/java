package array;

class demoarr{
    void pq1(){
       int arr[]={1,2,3,4,5};
       int s=0;
       for(int a:arr){
          s=s+a;
       }
       System.out.println("sum is"+s);
  
    }

    void pq2(){
        int a;
        int arr[]={34,23,12,78,67};
        a=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>a){
                a=arr[i];
            }
        }
        System.out.println("max is"+a);

    }
}

public class practiseproblems {
    public static void main(String[] args) {
        demoarr obj=new demoarr();
        obj.pq2();
    }
}