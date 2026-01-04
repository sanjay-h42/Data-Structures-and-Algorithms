// The algorithm does not need to know counts, it only relies on the fact that the majority element cannot be cancelled completely.

// Moore's Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int majorityElement=0;
        for(int element : nums){
            if(count==0){
                majorityElement=element;
            }
            if(majorityElement==element){
                count++;
            }
            else{
                count--;
            }
        }
        return majorityElement;
    }
}