class Solution {
    public int minPartitions(String n) {
        int max = 0;

        for(char ch : n.toCharArray()){
            int digit = ch - '0';

            max = Math.max(max , digit);

            if(max == 9){
                return 9;
            }
        }
        return max;
    }
}