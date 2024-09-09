package oops;
class A{
    int x=0;
    void f(){
        int z=++x;
        System.out.println(z);
    }
}

public class basic2 {
    public static void main(String[] args) {
        A obj=new A();
        obj.x=10;
        obj.f();
    }
    
}
