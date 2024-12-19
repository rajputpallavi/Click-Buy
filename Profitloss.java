import java.util.Scanner;

public class Profitloss {
    public static void main(String[] args) {
        int loss;
        int profit;
      
        Scanner sc=new Scanner(System.in);
        System.out.print("Cost price:");
        int cp=sc.nextInt();
        System.out.print("Selling price:");
        int sp=sc.nextInt();
       
        if(cp==sp){System.out.println("No profit or loss");}
        else if(cp>sp){
            loss=cp-sp;
            System.out.println("Loss = "+loss);}
        else { 
   
        profit=sp-cp;
        System.out.println("Profit = "+ profit);}
        }

}

