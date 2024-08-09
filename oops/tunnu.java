package oops;

import oops.jhunnu;
public class tunnu {
    public static void main(String[] args) {
       jhunnu obj=new jhunnu();
       System.out.println(obj.str);
       jalebi obj5=new jalebi();
       obj5.nothing();
    }
  


    
}
class jalebi extends jhunnu{
    void nothing(){
        jhunnu obj4=new jhunnu();
        System.out.println(obj4.str);
    }
}