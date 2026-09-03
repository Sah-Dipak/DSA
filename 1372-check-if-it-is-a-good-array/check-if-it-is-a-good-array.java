class Solution {
    public boolean isGoodArray(int[] nums) {
        int n = nums.length;

        int gcd = nums[0];

        for(int i=1; i<n; i++){

            int a = gcd;
            int b = nums[i];

            while(b != 0){
                int temp = a % b;
                a = b; 
                b = temp;
            }

            gcd = a;
        }

        return gcd == 1;
    }
}