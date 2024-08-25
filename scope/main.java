//scope-region where a variable can be accessed
package scope;
class algebra{
    // int a=10;
    // int b=30;

    int add(){
        int p=20;
        int q=34;
        return p+q;
    }

    int sub(){
        int p=90;
        int q=100;
        return p-q;
        
    }
    void demo(){
        int a=10;
        System.out.println(a);
        for(int i=0;i<10;i++)
        {
            int b=80;
            System.out.println(b);
        }
        for(int i=0;i<10;i++)
        {
            int b=45;
            System.out.println(b);
        }

    }
}

public class main {
    public static void main(String[] args) {
       algebra obj=new algebra();
       obj.demo();
    }

//formal parameters -defined using function definition~int sum(int a,int b)
//actual -sum(x,y)-parameters passed while funvtion calling
//

//pass by value-copies the value of actual parameter,,creates its own copy 
//pass by refrnce-passes the addess of actual and chnges in main variable is made ,doesn't creates its own copy
 

    
}
