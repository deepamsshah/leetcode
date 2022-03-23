class Solution {
    public int[] sumZero(int n) {
        int[] yolo = new int[n];
        if(n%2==0){
            for(int i =0;i<n/2;i++){
                yolo[i] = -n/2+i;
                yolo[n-1-i] = n/2-i;
            }
        }else{
            for(int i =0;i<n/2+1;i++){
                yolo[i] = -n/2+i;
                yolo[n-i-1] = n/2-i;
            }
            yolo[(n)/2]=0;
        }
        return yolo;
    }
}