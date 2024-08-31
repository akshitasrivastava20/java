package array;
// //1-d-simple array
// //2-d array of arrays that is at each index an array is stored
// //1-d 
// int ages[]={1,2,3,4};
// //2-d
// int marks[][]=new int[4][3];
// //this will make an array of length 4 having an aaray of length 3 at its each index
// //2-d direct
// int weights[][]={{1,2,3},{4,5,6},{7,8,9}};

class demo{
    void arraytype(){
        // int marks[][]=new int[4][3];
        int weights[][]={{56,43,32},{88,66,44},{22,34,56}};
        // System.out.println(weights[0][0]);
        // System.out.println(weights[0][1]);
        // System.out.println(weights[0][2]);
        for(int i=0;i<weights.length;i++){
            for(int j=0;j<weights[i].length;j++){
                System.out.println(weights[i][j]);
            }
            System.out.println(" ");
        }
        // //using for each loop
        //  int ages[]={1,2,3,4};
        // for(int age:ages){
        //     System.out.println(age);
        // }
        //using while loop
        // int i=0;
        // while(i<3){
        //     System.out.println(ages[i]);
        //     i++;
        // }

        System.out.println("array length"+weights.length);
    }
}


public class types {
    public static void main(String[] args) {
        demo obj=new demo();
        obj.arraytype();
        
    }
    
}
