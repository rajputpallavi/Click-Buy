public class Copy{
    public static void main(String[] args) {
        int[] arr={10,3,3,7,9,10};
      //  int[] arr1=new int[6];
        // for(int i=0;i<6;i++){
        //     arr1[i]+=arr[i];
        // }
        // for(int i=0;i<6;i++){
        //     System.out.println(arr1[i]);
        // }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate element found: "+arr[i]);
                }
            }
        }
        
    }
    
}
