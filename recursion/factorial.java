package recursion;

public class factorial {
    public static int fact(int n){
        if(n==1||n==0)
          return 1;
        int f=n*fact(n-1);
        return f;
      
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
