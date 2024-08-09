package oops;

public class jhunnu {
    public String str="public jhunnu";
    public static void main(String[] args) {
        jhunnu obj=new jhunnu();
        System.out.println(obj.str);
        sweety obj2=new sweety();
        obj2.good();
        
        
    }
    
}
class sweety{
    void good(){
        jhunnu  obj1=new jhunnu();
        System.out.println(obj1.str);
    }
}
