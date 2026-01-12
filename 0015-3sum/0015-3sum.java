// ✅ Are both solutions correct?
// ✔ YES
// Code 1: Inline two-pointer logic inside threeSum
// Code 2: Uses a helper method twoSum2 (modular approach)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         // modular approach   
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
            
            
        for(int i=0; i<nums.length && nums[i]<= 0; i++){
            
            if(i == 0|| nums[i] != nums[i-1]){
                twoSum2(nums, i, result);
            }
        }
        return result;  
            
    }
    
    void twoSum2(int[] nums, int i, List<List<Integer>> result){
        
        int left = i+1;
        int right = nums.length - 1;
        
        while(left<right){
            
            int sum = nums[i]+nums[left]+nums[right];
            
            if(sum < 0){
                ++left;
            }
            else if(sum > 0){
                --right;
            }
            else{
                result.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                while(left<right && nums[left] == nums[left-1]){
                    ++left;
                }
            }
            
        }
        
    }
}


        // Arrays.sort(nums);
        // List<List<Integer>>result=new ArrayList<>();
        
        // for(int i=0;i<nums.length-2;i++){
        //     if(i==0 || i>0 && nums[i]!=nums[i-1] ){

        //         int low=i+1,high=nums.length-1,sum=-nums[i];
        //         while(low<high){
        //             if(nums[low]+nums[high]==sum){
        //                 result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    
        //             while(low<high && nums[low]==nums[low+1]) low++;
        //             while(low<high && nums[high]==nums[high-1]) high--;

        //             low++;high--;
        //             }
        //             else if(nums[low]+nums[high]<sum) low++;
        //             else high--;
        //         }

        //     }
        // }
        // return result;

    