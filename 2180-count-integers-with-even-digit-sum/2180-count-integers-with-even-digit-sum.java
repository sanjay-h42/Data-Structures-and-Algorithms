class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
        if(SumOfDigits(i)%2==0){
            count++;
        }
        }
        return count;
    }
    private int SumOfDigits(int num){
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        return sum;
    }
}