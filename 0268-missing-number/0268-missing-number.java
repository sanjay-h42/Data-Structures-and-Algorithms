class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int expectedSum=0;
        for(int i=1;i<nums.length+1;i++){
            expectedSum+=i;
        }
        int result=expectedSum-sum;
        return result;
    }
}