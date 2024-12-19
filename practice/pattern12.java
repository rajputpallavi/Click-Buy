public class pattern12 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            //spaces
            for(int j=1;j<n-i;j++){
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();

        }

        for(int i=n-1;i>0;i--){
            //spaces
            for(int j=1;j<n-i+1;j++){
                System.out.print("  ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            for(int k=0;k<i-1;k++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
