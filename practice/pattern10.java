public class pattern10 {
    public static void main(String[] args) {
        int a=5;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            for(int l=2;l<=i;l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
