class Solution {
    public int diagonalSum(int[][] mat) {
        int primary=0;
        int secondary=0;
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    primary+=mat[i][j];
                }
                if((i+j)==(mat.length-1)){
                    secondary+=mat[i][j];
                }
            }
        }
        
        if(mat.length%2!=0){
            secondary-=mat[(mat.length-1)/2][(mat.length-1)/2];
        }
        return primary+secondary;
    }
}