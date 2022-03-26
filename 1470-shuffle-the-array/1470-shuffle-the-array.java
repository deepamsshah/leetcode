class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] yo =new int[2*n];
        for(int i=0;i<n;i++){
            yo[2*i]=nums[i];
        }
        for(int j=0;j<n;j++){
            yo[(2*j)+1]=nums[n+j];
        }
        return yo;
    }
}