class Solution {
    public int[] getConcatenation(int[] nums) {
        int[]result=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=nums[i];
        }
        int index=nums.length;
        for(int i=0;i<nums.length;i++){
            result[index++]=nums[i];
        }
        return result;
    }
}