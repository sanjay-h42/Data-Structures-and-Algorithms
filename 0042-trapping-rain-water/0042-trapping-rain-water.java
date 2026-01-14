class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int result=0;
        int leftMax=0;
        int rigthMax=0;

        while(left<=right){
            if(height[left]<=height[right])
            {
                if(height[left]>=leftMax) 
                    leftMax=height[left];
                else
                    result+=leftMax-height[left];
                
                left++;
            }
            else{
                if(height[right]>=rigthMax) 
                    rigthMax=height[right];
                else
                    result+=rigthMax-height[right];
                
                right--;
            }
            
        }
        return result;
    }
}