class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int ans = 0;
        int[] rows = new int[n];
        int[] cols = new int[m];
        for (int k = 0; k < indices.length; k++) {
            cols[indices[k][1]]++;
            rows[indices[k][0]]++;
        }
        
        int oddRows = 0;
        for (int i = 0; i  < n; i++) {
            if (rows[i] % 2 != 0) {
                oddRows++;
                ans += m; // add all items of the odd row first, if column is odd, deduct later
            }
        }
        
        for (int j = 0; j < m; j++) {
            if (cols[j] % 2 != 0) {
                ans -= oddRows; // if odd row and odd column, should be even, so need to deduct
                ans += n - oddRows; // for even row and odd column, should be added
            }
        }
        return ans;
    }
}