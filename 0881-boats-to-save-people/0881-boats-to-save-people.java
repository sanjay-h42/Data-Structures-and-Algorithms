class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);
        int answer=0;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            if(nums[left]+nums[right]<=limit){
                left++;
            }
            right--;
            answer++;
        }
        return answer;
    }
}