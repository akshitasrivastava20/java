

public class cloning {
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    //changes made won't reflect in main array they'll be just in cloned array
    //addresses will be different and deep copy is thus made 

    public static void main(String[] args) {
       int arr[]={1,2,3,4,5};

         int clone[]=arr.clone();
            clone[2]=100;
            System.out.println("original array");
            printarray(arr);
            System.out.println("cloned array");
            printarray(clone);
           

    }
    
}
