public class breakcontinue {
    public static void main(String[] args){
        //Break continue
        int i=0;
        while (true) { 
        
        if(i==3){
            i=i+1;
            continue;} //using continue you can skip the current iteration, and it will go back to while loop and continue the remaining loop
        System.out.println(i);
        i=i+1;
        if(i>5){break;} //using of break will terminate the loop
            
        }}
    }

