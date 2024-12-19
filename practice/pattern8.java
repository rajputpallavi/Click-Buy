// public class pattern8 {
//     public static void main(String[] args) {
//         int a=5;
//         for(int i=1;i<=a;i++){
//             for(int j=a-i;j>0;j--){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=a;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
   
// }

 public class pattern8 {
        public static void main(String[] args) {
           int n=5;
           for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=0;k<n;k++){
                System.out.print("*");
            }
            System.out.println();
           }
        }
       
    }
    
    