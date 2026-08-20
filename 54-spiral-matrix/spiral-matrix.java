class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        ArrayList<Integer> list = new ArrayList<>();

        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = m-1;

        while(startRow <= endRow && startCol <= endCol){

            for(int i=startCol; i<=endCol; i++){
                list.add(matrix[startRow][i]);
            }
            startRow++;

            for(int j=startRow; j<=endRow; j++){
                list.add(matrix[j][endCol]);
            }
            endCol--;

            if(startRow <= endRow){
                for(int i=endCol; i>=startCol; i--){
                    list.add(matrix[endRow][i]);
                }
                endRow--;
            }

            if(startCol <= endCol){
                for(int j=endRow; j>=startRow; j--){
                    list.add(matrix[j][startCol]);
                }
                startCol++;
            }
        }

        return list;
    }
}