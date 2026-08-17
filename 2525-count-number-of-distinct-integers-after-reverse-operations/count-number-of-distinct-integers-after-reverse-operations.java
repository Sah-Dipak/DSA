class Solution {
    public int countDistinctIntegers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        
           int rev = 0;
           int num = nums[i];
            while (num > 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num /= 10;
            }
             set.add(rev);
        }

        return set.size();
    }
}