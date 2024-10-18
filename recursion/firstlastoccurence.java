package recursion;
import java.util.Scanner;
public class firstlastoccurence {
  public static int  first=-1,last=-1;
   public static void occur(String s,int i,char a){
    
    if(i==s.length()){
        System.out.println("first"+first);
        System.out.println("last"+last);
        return;
    }
    if(s.charAt(i)==a){
        if(first==-1){
            first=i;
        }
        else{
            last=i;
        }
    }
    occur(s,i+1,a);
   } 
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String s=sc.next();
    System.out.println("enter the element to be searched");
    char c=sc.next().charAt(0);
    occur(s,0,c);
   }
}
