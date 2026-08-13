class Solution {
    public int countPrimes(int n) {
         boolean[] prime = new boolean[n];

        int i = 2;
        int count = 0;

        while (i < n) {
            if (!prime[i]) {
                count++;

                int j = i * 2;

                while (j < n) {
                    prime[j] = true;
                    j += i;
                }
            }
            i++;
        }

        return count;
        
    }
}