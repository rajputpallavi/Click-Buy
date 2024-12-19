public class Bitwise {
    public static void main(Stringss[] args){
        
        //bitwise OR
        System.out.println("OR");
        System.out.println(0|1);
        System.out.println(0|0);
        System.out.println(1|1);

        //bitwise AND
        System.out.println("AND");
        System.out.println(0&1);
        System.out.println(0&0);
        System.out.println(1&1);

        //bitwise NOT
        System.out.println("NOT");
        System.out.println(~1);
        System.out.println(~0);
        System.out.println("Calculate");
        //calculate
        int a=5;
        int result= ++a*(3+8)%35-28/7;
        System.out.println(result);
        System.out.println("1");
        int i=0; int max=5;
        for( ;i<max;i++){
            System.out.println(i);  
        }
System.out.println("2");
        int x=10,y=3,z;
        for(z=0;z<x;){
            z=z++ +y;
            System.out.println(z);
        }

        System.out.println("3");
        int p=5,q=10;
        int r= ++p | q++;
        System.out.println(p+" "+q+" "+r);

        System.out.println("4");
       // int e=0,f=10;
       // System.out.println((!(e &&f)));


        
       




    }
}
