class Solution {

    static boolean binarySearch(int[] nums , int target ,int low){
        int high = nums.length-1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                return true;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }

    public int findPairs(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);
        int count = 0;
        for(int i=0; i<n; i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

        

        int target = k + nums[i];
        if(binarySearch(nums , target , i+1)){
                count++;
        }

        }
        return count;
    }
}