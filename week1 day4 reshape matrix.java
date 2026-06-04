class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length == 0 || mat.length * mat[0].length != r*c){
            return mat;
        }
        int[][] res = new int[r][c];
        int a = 0,
            b = 0;
        for(int i=0; i<mat.length;i++){
            for(int j=0; j< mat[0].length;j++){
                res[a][b++]=mat[i][j];
                if(b==c){
                    a++;
                    b=0;
                }
            }
        } 
        return res;   
    }
}
