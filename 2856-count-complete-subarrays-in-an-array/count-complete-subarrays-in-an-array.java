class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;

        Set<Integer> set = new HashSet<>();

        int count = 0;

        for(int ele : nums){
            set.add(ele);
        }

        int distinct = set.size();

        for(int i=0; i<n; i++){
            Set<Integer> temp = new HashSet<>();

            for(int j=i; j<n; j++){
                temp.add(nums[j]);

                if(temp.size() == distinct){
                    count++;
                }
            }
        }

        return count;
    }
}