public class casting {
    public static void main(String[] args) {
        System.out.println("casting");
        double price =100.00;
        double finalprice=price+10;
     //here we can easily store an int type (4 bytes) in double type(8 bytes)
     //because double has more storage capacity than int
     System.out.println("java allows storing int in double: "+finalprice);
      /*but we cannot do the reverse as int is of small capacity size than a double so in this it may lose some data as the space size is less 
     int p=100;
     int fP=p+12.22; //error
     for this we use "EXPLICIT CASTING" ..where agar hamara thoda bohot data lose bhi hogya hume koi problem nhi 
     for that do this-->
     int fp=p+(int)12.22;
      */ 
     System.out.println("Explicit casting when we put a large byte size data in small byte size as long as it is compatible (but it may return in some amount of data loss)");
     int p=100;
     int fp=p+(int)12.99;
     System.out.println(fp); //you can see..the decimal value after 12 got lost
 

System.out.println("Constants in java are made with keyword \"final\"");
      //constants jinki hum value change nhi karna chahate.args..args.for that we use the keyword "final"
      int age=10;
      age=32;//here wecan easily change the value of variable
      System.out.println(age);
      final float PI=3.14F;
    // PI=1.1F; -->error will arise when you will try to change the value of a constant variable 
      System.out.println(PI);
  
    
      //we usually made the constant variable with captital letters ..it is just a convention not compulsory 
 



      System.out.println("Math class");
      //Math.max(a,b)
      System.out.println(Math.max(5,6));
        //Math.min(a,b)
        System.out.println(Math.min(5,6));
        //Math.random()--prints any random number
        System.out.println(Math.random());
        //now remember-- random also gives us value in long int type...
        //so typecast it ..to get int value type
        System.out.println((int)Math.random());
        //you see it always give s you zero..because random generates values less than 1...like 0.2343513...so on
        //to get integer values we need to multiply it with 100 or 10 or 100 to get int value as it will shift the decimal point to right side anf we will get the number in the whole part
        System.out.println((int)(Math.random()*100));
    }
}
