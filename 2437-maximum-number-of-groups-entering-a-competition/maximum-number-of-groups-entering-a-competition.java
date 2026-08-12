class Solution {
    public int maximumGroups(int[] grades) {
        int n = grades.length;

        int groups = 0;
        int students = 0;

        while(groups + students + 1 <= n){
            groups++;
            students += groups;
        }

        return groups;
    }
}