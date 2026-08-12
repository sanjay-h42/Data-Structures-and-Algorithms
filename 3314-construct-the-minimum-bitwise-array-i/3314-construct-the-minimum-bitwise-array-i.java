class Solution {
    public int[] minBitwiseArray(java.util.List<Integer> nums) {

        int[] result = new int[nums.size()];

        for (int i = 0; i < nums.size(); i++) {

            int n = nums.get(i);

            if (n == 2) {
                result[i] = -1;
                continue;
            }

            int bit = 0;

            while ((n & (1 << bit)) != 0)
                bit++;

            result[i] = n - (1 << (bit - 1));
        }

        return result;
    }

}