class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                list.add(nums[i]);
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                list.add(nums[i]);
            }
        }

        for(int i=0; i<n; i++){
            nums[i] = list.get(i);
        }
    }
}