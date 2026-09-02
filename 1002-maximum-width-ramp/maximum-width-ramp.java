class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;

        int ans[][] = new int[n][2];

        for(int i=0; i<n; i++){
            ans[i][0] = nums[i];
            ans[i][1] = i;
        }


        Arrays.sort(ans , (a,b) -> Integer.compare(a[0] , b[0]));

        int minIndex = n;
        int maxWidth = 0;

        for(int i=0; i<n; i++){
            
            maxWidth = Math.max(maxWidth , ans[i][1] - minIndex);
            minIndex = Math.min(minIndex , ans[i][1]);

        }


        return maxWidth;
       
    }
}