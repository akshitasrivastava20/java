package recursion;

public class stringduplicate {
    public static boolean[] arr=new boolean[26];
    public static void duplicacy(String s,int i,String newstring){
        if(i==s.length()){
            System.out.println(newstring);
        }
        if(arr[s.charAt(i)-'a']==true){
            duplicacy(s, i+1, newstring);
        }
        else{
            newstring+=s.charAt(i);
            arr[s.charAt(i)-'a']=true;
            duplicacy(s, i+1, newstring);
        }
    }
    public static void main(String[] args) {
        duplicacy("akshitadevtolusaini",0,"");
    }

}
