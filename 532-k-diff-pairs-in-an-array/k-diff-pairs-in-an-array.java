class Solution {
    public int findPairs(int[] nums, int k) {

        Arrays.sort(nums);
        int n = nums.length;

        int count = 0;
        int l = 0;
        int r = 1;

        while(r < n){
            if(l == r || nums[r] - nums[l] < k){
                r++;
            }else if(nums[r] - nums[l] > k){
                l++;
            }else{
                l++;
                count++;

                while(l < n && nums[l] == nums[l-1]) l++;
                r = Math.max(r , l+1);
            }
        }

        return count;
    }
}