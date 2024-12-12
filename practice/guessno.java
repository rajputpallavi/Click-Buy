import java.util.*;
public class guessno {
    public static void main(String[] args) {
        int num=(int)(Math.random()*100);
        int guess=0;
        Scanner sc= new Scanner(System.in);
       do{ System.out.print("Guess a number: ");
         guess=sc.nextInt();
        if(guess==num){
            System.out.println("Wohoo...Correct number!!!");
            break;
        }
        else if (guess>num) {
            System.out.println("Number is too large");
            
        }
        else if (guess<num) {
            System.out.println("Number is too small");
            
        }

        else{
            System.out.println("oops...try again!");
        }}
        while(guess>0);

    }
}
