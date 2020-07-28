public class runningSum {
    public static int[] runningSum(int[] nums){
        int[] result = new int[nums.length];
        int sum=0;
        for (int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args){
        int [] ar1 = {1,1,1,1};
        System.out.println(runningSum(ar1));
    }

}
