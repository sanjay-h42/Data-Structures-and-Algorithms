//1. Find the break point
// Traverse from right to left and find the first index i such that
// arr[i] < arr[i + 1]
// 2.If no break point exists
// Reverse the entire array and return.
// 3.Find the next greater element
// 4.From the right, find index j such that
// arr[j] > arr[i]
// 5.Swap arr[i] and arr[j]
// 6.Reverse the right half
// Reverse the array from i + 1 to n - 1

class Solution {
    public void nextPermutation(int[] nums) {
        if( nums==null || nums.length<=1 )
            return;
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
            i--;
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i])
                j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }

    public void swap(int[]nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
    }

     public void reverse(int[]nums,int i,int j){
        while(i<j)
            swap(nums,i++,j--);
     }
}