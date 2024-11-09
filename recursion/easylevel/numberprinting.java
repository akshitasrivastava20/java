package recursion.easylevel;

public class numberprinting {
    public static void main(String[] args) {
        // printnum(5);
        // printnumrev(5);
        printnumboth(5);
    }
    static void printnum(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printnum(n-1);
        System.out.println(n);
    }
    static void printnumrev (int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printnumrev(n-1);
    }
    static void printnumboth(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printnumboth(n-1);
        System.out.println(n);

    }
}
