//soluiton to the https://leetcode.com/problems/range-sum-query-2d-immutable/ problem
class RangeSumQuery2D {

 
    int sum[][];
    public NumMatrix(int[][] matrix) {
    
        int r = matrix.length;
        int c = matrix[0].length;
        sum = new int[r + 1][c + 1];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
               
                sum[i + 1][j + 1] = sum[i][j + 1] + sum[i + 1][j] + matrix[i][j] - sum[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
       return sum[row2 + 1][col2 + 1] - sum[row1][col2+1] - sum[row2 + 1][col1] + sum[row1][col1];
        
    }
}
