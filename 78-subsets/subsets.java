class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        int n = nums.length;

        list.add(new ArrayList<>());

        for(int i=0; i<n; i++){
            int size = list.size();
            for(int j=0; j<size; j++){

                List<Integer> ans = new ArrayList<>(list.get(j));
               

                ans.add(nums[i]);

                list.add(ans);
            }
        }

        return list;
    }
}