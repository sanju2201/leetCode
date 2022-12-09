class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n= matrix[0].length;
        int matrix1[][] = new int[n][m];
              
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               matrix1[i][j] = matrix[j][i];            
            }
        }
        return matrix1;
    }
}

//  https://leetcode.com/problems/transpose-matrix/description/
