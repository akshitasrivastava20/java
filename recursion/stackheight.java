package recursion;


public class stackheight {
    public static double axe(double x,double n){
        if(n==0)
           return 1;
        return (x*axe(x,n-1)) ;  
    }
    public static void main(String[] args) {
        double p=axe(5.0,3.0);
        System.out.println(p);
    }
}
