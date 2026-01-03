class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] row:matrix){
            for( int col:row){
                if(col == target){
                    return true;
                }
            }
        }
        return false;
    }
}