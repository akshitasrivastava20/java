package array;
//stack-primituve,refrencevariable,function calls
//heap-objects
//aarray is also an object
//int ages[]-stack
//ages=new int[10]-heap
 
class example{
     void demoarray(){
        int ages[]=new int[3];
        String names[]={"akshita","dev","tolu"};

        ages[0]=2;
        ages[1]=4;
        ages[2]=6;
       // ages[3]=8;
       for(int i =0;i<=3;i++){
        System.out.println(ages[i]);
       }

        
     }
}

public class memory {
    public static void main(String[] args) {
       example obj=new example();
       obj.demoarray();

        
    }
    
}
