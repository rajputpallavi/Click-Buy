public class pattern11 {
    public static void main(String[] args) {
       int n=4;
       //upper half
       for(int i=0;i<n;i++){
        //left stars
        for(int j=0;j<=i;j++){
            System.out.print("*");
        } 
    //spaces
        for(int j=n+2-(2*i);j>=0;j--){
            System.out.print(" ");
        }
       //right stars
        for(int k=0;k<=i;k++){
            System.out.print("*");
        } 
        System.out.println();
       }
//lower half
       for(int i=n-1;i>=0;i--){
        //left stars
        for(int j=0;j<=i;j++){
            System.out.print("*");
        } 
    //spaces
        for(int j=n+2-(2*i);j>=0;j--){
            System.out.print(" ");
        }
       //right stars
        for(int k=0;k<=i;k++){
            System.out.print("*");
        } 
        
        System.out.println();
       }

    }
}
