package recursion;
import java.util.Scanner;

public class reversestring {
    public static void printstring(String s,int i)
    {   if(i==-1)
           return;

        System.out.print(s.charAt(i));
        printstring(s,i-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        String s=sc.next();
        printstring(s,(s.length())-1) ;

    }
    


}
