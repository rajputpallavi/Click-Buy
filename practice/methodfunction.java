public class methodfunction {
 //methods or Function in java 
    //methods or function are written in the classes
    //example= a remote in which there are different buttons that perform specific function
    //in this..the buttons are the methods or functions and the remote itself is a class

    //these are the methods/functions below:
    public static void printjava(){
        System.out.println("Hello java");

    }
    public static void printName(String name){
        System.out.println("My name is: "+name);
    }
    public static int printSum(int a,int b) {
       return a+b;
        }
//this is the main function
    public static void main(String[] args) {
        printjava();//calling a function
        printName("Aman");
       System.out.println(printSum(2,3)); 
    }
   



    
}
