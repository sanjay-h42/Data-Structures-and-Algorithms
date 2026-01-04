// use two pointer and binary search i and j ,front and back move to and forth 

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums==null || nums.length==0) return result;
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long target_2=(long) target-nums[j]-nums[i];
                int front=j+1;
                int back=n-1;

                while(front < back){
                    long two_sum= (long) nums[front]+nums[back];

                    if(two_sum < target_2) front++;
                    else if(two_sum > target_2) back--;
                    else{
                        List<Integer> quad=new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);
                        result.add(quad);
                        
                        //processing for the duplicating for the number 3
                        while(front < back && nums[front]==quad.get(2)) front++;
                        //processing for the duplicating for the number 4
                         while(front < back && nums[back]==quad.get(3)) back--;
                    }
                }
                while(j+1 < n && nums[j+1]==nums[j]) j++;
            }
            while(i+1 < n && nums[i+1]==nums[i]) i++;
        }
        return result;
    }
}