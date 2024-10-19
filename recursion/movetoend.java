package recursion;

public class movetoend {
    public static void movex(String s,int i,int c,String newstring)
    {
     if(i==s.length()-1){
        for(int j=0;j<c;j++){
            newstring+='x';

        }
        System.out.println(newstring);
        return;
     }
     if(s.charAt(i)=='x'){
        c++;
        movex(s,i+1,c,newstring);
     }
     else{
        newstring+=s.charAt(i);
        movex(s,i+1,c,newstring);

     }
    }
    public static void main(String[] args) {
        movex("abxxbdxdex",0,0,"");
    }
}
