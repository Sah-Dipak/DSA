class Solution {
    public int minOperations(int n) {
        int ans = 0;
        
        for(int i=0; i<n/2; i++){
            int value = 2 * i;

            int rem = n - 1 - value;

            ans += rem;
        }
        return ans;
    }
}