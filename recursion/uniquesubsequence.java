package recursion;
import java.util.HashSet;
public class uniquesubsequence {
    public static void uniqueset(String s,int i,String newstring,HashSet<String>set){
        if(i==s.length()){
            if(set.contains(newstring)){

                return;
            }
            else{
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }

        //to be
        char current=s.charAt(i);
        uniqueset( s, i+1,newstring+current,set);
        //not to be
        uniqueset( s, i+1,newstring,set);
    }
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        uniqueset("abc",0,"",set);
    }
}
