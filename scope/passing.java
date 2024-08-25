package scope;

public class passing {
    static void chngvalue(int a){
        a*=100;

    }
    public static void main(String[] args) {
        int a=10;
        System.out.println("before chng"+a);
        chngvalue(a);
        System.out.println("after chng"+a);
    }
    
}
   