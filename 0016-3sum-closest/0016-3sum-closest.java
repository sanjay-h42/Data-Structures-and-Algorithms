class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result=nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
            int answer=nums[i]+nums[left]+nums[right];

            if(Math.abs(target-answer)<Math.abs(target-result)){
                result=answer;
            }

            if(answer==target) return target;
            else if(answer < target) left++;
            else right--;
        }
        }
        return result;
    }
}