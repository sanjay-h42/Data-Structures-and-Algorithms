class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len=arr.length;
        double limit=0.05*len;
        int start=(int)limit;
        int end=len-(int)limit;
        int new_len=0,sum=0;

        for(int i=start;i<end;i++){
            sum+=arr[i];
            new_len++;
        }
        return (double)(sum)/(new_len);
    }
}