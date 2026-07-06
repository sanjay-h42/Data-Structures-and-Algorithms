class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int k=right;
        int[] newArray=new int[nums.length];

        while(left<right){
            int leftSquared=nums[left]*nums[left];
            int rightSquared=nums[right]*nums[right];

            if(leftSquared>rightSquared){
                newArray[k--]=leftSquared;
                left++;
            }
            else{
                newArray[k--]=rightSquared;
                right--;
            }

        }
        newArray[0]=nums[left]*nums[left];
        return newArray;
    }
}