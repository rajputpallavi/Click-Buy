import java.util.Scanner;
public class Stringss {
    public static void main(String[] args) {
        //Strings are non-primitve in java
        //Strings are immutable,i.e.,it cannot be changed...in order to save the change...we need to store in it new string
        // but in string it is not necessarry to use the new keyword...we can directly assign a string
        String friend = new String("Apu"); 
        String name="Pallavi";
        System.out.println("length");
        //length()
        System.out.println(name.length());
        //concat 
        System.out.println("concatenate");
        System.out.println(name+" "+friend);
        //charAT(0)
        System.out.println("charAt(index)");
        System.out.println(name.charAt(0));
        //replace--but it does not affect the original string
        System.out.println("Replace");
        System.out.println(name.replace('a','o'));
        System.out.println(name);
        //in order to save the changes we have to store it to another variable
        String name1=name.replace('a','o');
        System.out.println(name1);

        //Subtring
        System.out.println("Substring");
        String line="Aman and Akku";
        System.out.println(line.substring(0,6));//the last character..charAt(6) willnot include
        System.out.println(line.substring(5,8));
        
        System.out.println("Taking inputs:");
        //we will be using a scanner class
        //firstly make an object of class scanner
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float b=sc.nextFloat();
        String c=sc.next();//this will aonly take the token..means only first word of the whole string
        String d=sc.nextLine();//now this will take whole string..as we have already taken the first word in previous command
        //so it will take the rest of the line

        String e=sc.nextLine();//now ..finally this will take full string 
        System.out.println(a+" "+b+" "+c+" "+d+" "+e); 



        
    }
}
