import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //1
        // int[] arr={10,20,30,40,50,60};
        // System.out.println("Array Element");
        // for(int i=0;i<arr.length;i++){
        //     System.out.println("Element at index "+i+" : "+arr[i]);
        // }

        // //2
        // int[] number=new int[5];
        // number[0]=10;
        // number[1]=20;
        // number[2]=30;
        // number[3]=40;
        // number[4]=50;
        // //System.out.println("Static Array Elemnt ");
        // int sum=0;
        // for(int i=0;i<number.length;i++){
        //    // System.out.println("Element at index "+i+":"+number[i]);
        //    sum+=number[i];
        // }
        // System.out.print("Sum of array elements: "+sum);

        //3
        
        System.out.print("Enter number of elements to enter: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
           sum+=arr[i];
        }
        System.out.print("Sum of array elements: "+sum);



    }
}
