class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        int n = nums.length;

        for(int i=0; i<n-2; i++){

            Set<Integer> hashset = new HashSet<>();

            for(int j=i+1; j<n; j++){
                int third = -(nums[i] + nums[j]);
            
                     if(hashset.contains(third)){
                        List<Integer> ans = new ArrayList<>();

                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(third);
                        Collections.sort(ans);
                        set.add(ans);
                    }
                hashset.add(nums[j]);
            }

        }
            return new ArrayList(set);
    }
}