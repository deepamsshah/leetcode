class Solution {
public int diagonalSum(int[][] mat) {
int n = mat.length;

    int primaryDiagonal=0;
    int secondaryDiagonal =0;
    for (int i=0;i<n;i++) // primary diagonal
     {
                primaryDiagonal+=mat[i][i];
       }
   
    for(int i=0;i<n;i++) //secondary Diagonal
    {
        secondaryDiagonal+=mat[i][n-1-i];
    }
    
    if(n%2!=0) // for odd length matrix
    {
        secondaryDiagonal-=mat[n/2][n/2];
    }
    return primaryDiagonal+secondaryDiagonal;       
}
}