class Solution {
    public void setZeroes(int[][] matrix) {
        int col0=1;
        int rows=matrix.length;
        int cols=matrix[0].length;

        for(int i=0;i<rows;i++){
            //if matrix[i][0] is 0 then it was recorded and it was assigned to zero at last
            if(matrix[i][0]==0)
                col0=0;

            for(int j=1;j<cols;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
       
       // backtracking from the last element to check the elements row and column is zero then the element is zero
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=1;j--)
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
                
                //if the first element is zero then it was assigned to 0 at last 
                if(col0==0) matrix[i][0]=0;
        }
    }
}