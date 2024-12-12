public class excphandle {
    public static void main(String[] args) {
        //try catch in exception handling
        int[] marks={97,99,91};
       // System.out.println(marks[5]);
       //if you run the above code then an exception will arise ArrayIndexOutOfbound
       //due to which the code will gives error and the remaining code will also not run
       //so to avoid this..use try and catch method of handling exception
        try { System.out.println(marks[5]);
            
        } catch (Exception e) {
            //do something after exception 
        }
        System.out.println("The name is Aman");
        //you see now the exception got handled in catch block and the remaining code will execute without any error
    }
}
