package array2;
//whwn we copy one array to another using assignment operator directly then changes in any one of the array will reflect in both the arrays this is beacuse shallow copy is created and both variables arr and arr-2 will refer to the same memory address

//new memory is allocated only when new keyword is used


public class refrence {
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
         }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr_2[]=arr;
        System.out.println("before");
       System.out.println("arr");
       printarray(arr);
       System.out.println("arr_2");
       printarray(arr_2);

        arr_2[0]=10;
        System.out.println("after");
        System.out.println("arr");
        printarray(arr);
        System.out.println("arr_2");
        printarray(arr_2);

    }
}
 