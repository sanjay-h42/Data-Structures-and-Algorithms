// linked list cyclic sorting using the tortoise method

class Solution {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];// moving single step 
            fast=nums[nums[fast]];// moving 2 times of the slow

        }while(slow!=fast);
        fast=nums[0];

        while(slow!=fast)
        {
             slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}