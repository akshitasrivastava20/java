package recursion;

public class towerofhanoi {
    public static void Hanoi(int n,char s,char h,char d ){
        if(n==0)
          return;
        Hanoi(n-1,s,d,h);
        System.out.println("from:" + s + " to:" + d);
        Hanoi(n-1,h,s,d);
    }
    public static void main(String[] args) {
        
        Hanoi(3,'a','b','c'); }
}
