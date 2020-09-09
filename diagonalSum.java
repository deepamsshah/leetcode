class diagonalSum {
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

    public static void main(String[] args) {
        String n ="153";
        System.out.println(n.length());
        for(int i=0;i<n.length();i++){
            System.out.println(n.charAt(i));
        }
    }
}