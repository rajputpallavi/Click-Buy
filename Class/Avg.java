import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students whose marks are going to be added: ");
        n=sc.nextInt();
        int total=0;
        int[] marks=new int[n];
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            total+=marks[i];}
             int average=total/n;
             System.out.println("Average marks of "+n+" students: "+average);
             System.out.print("The students whose marks are greater than average: ");
            for(int i=0;i<n;i++){
                if(marks[i]>average){
                    System.out.println(marks[i]);
                }
            }
    }
    
}
