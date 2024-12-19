public class pattern2 {
    public static void main(String[] args) {
        int a=5;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(i==0||i==a-1||j==0||j==a-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
