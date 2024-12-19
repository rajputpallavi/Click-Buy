public class pattern9 {
    public static void main(String[] args) {
        int a=5;
        for(int i=1;i<=a;i++){
            for(int j=a-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
