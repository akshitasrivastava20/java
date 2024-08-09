package strings;
import java.util.Scanner;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("tony");
        System.out.println(sb);
        //char at zero
        System.out.println(sb.charAt(0));
        //set char at zero
        sb.setCharAt(0,'p');
        System.out.println(sb);
        //to insert
        sb.insert(0,'S');
        System.out.println(sb);
        //to delete
        sb.delete(1,2);
        System.out.println(sb);
        //to append at the end
        sb.append('y');
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
