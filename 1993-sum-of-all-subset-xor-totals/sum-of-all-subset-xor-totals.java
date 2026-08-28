class Solution {
    public int subsetXORSum(int[] nums) {
        int ans = 0;

        for(int num : nums){
            ans = ans | num;
        }

        int n = nums.length-1;

        int multi = 1 << n;

        int result = ans * multi;

        return (int)result;
    }
}