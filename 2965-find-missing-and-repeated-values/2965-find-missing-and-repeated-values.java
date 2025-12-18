class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int a=0;
        int b=0;

        Set<Integer>set=new HashSet();
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[i].length;j++){
                if(set.contains(grid[i][j])){
                    a=grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }

        for(int i=1;i<=n*n;i++){
            if(!set.contains(i))
            {
                b=i;
            }
        }

        return new int[]{a,b};

    }
}