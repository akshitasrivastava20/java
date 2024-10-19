package recursion;

public class subsequences {
        public static void subsequence(String s,int i,String newstring){
            if(i==s.length()-1){
                System.out.println(newstring);
                return;
            }
            //to be
            char current=s.charAt(i);
            subsequence(s,i+1,newstring+current);

            //not to be
            subsequence(s,i+1,newstring);
        } 
        public static void main(String[] args) {
            subsequence("akshita",0,"");
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
}
