class Solution {
    public int alternateDigitSum(int n) {
        int ans = 0;
        int count = 0;

        int temp = n;

        while(temp > 0){
            count++;
            temp /= 10;
        }


        while(n > 0){
            int rem = n % 10;
           
            if(count % 2 != 0){
             ans += rem;
            }else{
                ans -= rem;
            }
            count--;
            n = n / 10;
        }

        return ans;
    }
}