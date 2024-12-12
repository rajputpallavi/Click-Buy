
import java.util.*;
public class ternary {
    public static void main(Stringss[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=(a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("largest number: "+max);
        sc.close();
        //bitwise operator 
        // System.out.println(a&b|c); 
//bitwise Not operator (~)------>formula is 
//   ~n= -(n-1)
        int x=-13;
        System.out.println(~(x));



        /*
        in java, we cannot use more than two perators like this --(a>b>c)
        in java ...for(int i=0;1;i++)--this will not run..but in cpp..it will work
        but in cpp, we can do this ...(a>b>c)..firstly it will caluclate (a>b) and gives 1 or 0 ..and the it will evaluate (1 or 0 > c)
         */

    }
}
