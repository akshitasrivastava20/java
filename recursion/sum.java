package recursion;

public class sum {
    public static int sum_nat(int n){
        if (n==1)
           return 1;
        int sum=n+sum_nat(n-1);
         return sum;
    }
    public static void main(String[] args) {
        int s=sum_nat(3);
        System.out.println(s);
    }
    
}
