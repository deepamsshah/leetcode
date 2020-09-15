
class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                temp=A[i][j];
                A[i][j]=A[i][n-1-j];
                A[i][n-1-j]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(A[i][j]==0){
                    A[i][j]=1;
                }else{
                    A[i][j]=0;}
            }
        }
        return A;
    }
}