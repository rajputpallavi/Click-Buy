
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //if you already knew the marks or the values to be put in array just simply do:
        // int[] score={78,98,99};
        //you can use the keyword new to declare array
        int[] marks=new int[3];
        marks[0]=97;
        marks[1]=95;
        marks[2]=99;
        System.out.println(marks);//this will give us incorrect output...output, that will be mix of class name, hash code 
        System.out.println(marks[0]);//to get the correct outpu... we have to give index of array
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println("default initialization of int array");
        int[] m=new int[3];
        System.out.println(m[0]);//you can see we did not put any value in the array
        //in java...the default initialization occurs with Zero '0' in int array
        //in boolean array---the default initialization is "false"
        System.out.println("default initialization of bool array");
        boolean[] x=new boolean[3];
        System.out.println(x[0]);
        //remember even in case of primitve type the initialization is either with zero, null, false
        

        // to find the length of array
        //in string we find the length by using .length()--because it is a function in string
        //but in array--- it is inbuilt property..so we will just directly call length
        System.out.println(marks.length);
        System.out.println("Sorting");
        //sorting an array
        System.out.println("before sorting "+marks[0]);//marks at zero position before sorting
        Arrays.sort(marks);
        System.out.println("after sorting "+marks[0]);//after sorting
        

        //1D array
        System.out.println("1D array");
       int[] score={99,97,95};
       System.out.println(score[0]);
       System.out.println(score[1]);
       //2D array
       System.out.println("2D array");
       int[][] finalmarks={{95,78,99},{99,86,89}};
       System.out.println(finalmarks[0][0]);
       System.out.println(finalmarks[1][1]);

   

    }
}
