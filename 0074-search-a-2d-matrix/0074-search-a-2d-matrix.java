class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
  
    //     for(int[] row:matrix){
    //         for( int col:row){
    //             if(col == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    
        if(matrix.length==0) return false;
        int n=matrix.length;
        int m=matrix[0].length;

        int low=0;
        int high=matrix.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[mid/m][mid%m]==target){ 
                // [mid/m][mid%m] return the row by dividing and column through the reminder
                return true;
            }
            if(matrix[mid/m][mid%m]<target)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
 