class Solution {
    public int[] sumZero(int n) {
        int[] yolo = new int[n];
        for(int i =0;i<n/2;i++){
            yolo[i] = -n/2+i;
            yolo[n-1-i] = n/2-i;
        }
        if(n%2!=0){
            yolo[(n)/2]=0;
        }
        return yolo;
    }
}