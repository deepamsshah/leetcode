public class threeSum {

    public static boolean checkSet(int sum, int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                for(int k = 0;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                    }
                }
            }
        }

        return false;
    }
public static void main(String args[]){
    int sum = 0;
    int[] arr = {-1, 0, 1, 2, -1, -4};
    checkSet(sum, arr);

}
}
