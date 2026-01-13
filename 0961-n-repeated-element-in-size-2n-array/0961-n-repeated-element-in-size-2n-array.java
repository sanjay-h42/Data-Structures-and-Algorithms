class Solution {
    public int repeatedNTimes(int[] nums) {
         for(int i=0;i<nums.length-2;i++){

            //This checks:
            // Is the same number right next to it?
            // Or is it the same number with one element in between?
            // If either is true → this must be the repeated number → return it immediately.

            if(nums[i]==nums[i+1] || nums[i]==nums[i+2] )
                 return nums[i];
        }

        //If the repeated number was not found earlier, it must be at the end of the array.
        return nums[nums.length-1];
    }
}