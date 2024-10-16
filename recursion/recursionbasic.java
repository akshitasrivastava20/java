package recursion;


 

public class recursionbasic {
    public static void printnum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnum(n-1);
    
     }
     public static void printnum2(int n){
        if(n==0)
        return;
        printnum2(n-1);
        System.out.println(n);
     }
     public static void main(String[] args) {
        printnum(5);
        printnum2(5);
     }
}
