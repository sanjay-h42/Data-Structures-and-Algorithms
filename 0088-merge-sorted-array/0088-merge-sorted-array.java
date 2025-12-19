// using gap method or shell sorting 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int length=n+m;
        int gap=(length/2)+(length%2);

        while(gap>0){
        int left=0;
        int right=gap+left;


        while(right<length){
            //Evaluating in arr1 and arr2
            if(left<m && right>=m)
            {
                swap(nums1,nums2,left,right-m);
                // right-m is because it points to the corresponding index of the number
            }
            //Evaluating in arr 2 and arr2
            else if(left>=m)
            {
                swap(nums2,nums2,left-m,right-m);
            }
            // evaluating in arr1 and arr1
            else
            {
                swap(nums1,nums1,left,right);
            }
            left++;
            right++;
        }
            if(gap==1) break;
        gap=(gap/2)+(gap%2);
        }
    for(int i=0;i<n;i++)
    {
        nums1[m+i]=nums2[i];
    }
    }

    



    public void swap(int[]arr1,int []arr2,int i,int j){
        
        if(arr1[i]>arr2[j]){
            int temp=arr1[i];
            arr1[i]=arr2[j];
            arr2[j]=temp;
        }
    }
}
    

