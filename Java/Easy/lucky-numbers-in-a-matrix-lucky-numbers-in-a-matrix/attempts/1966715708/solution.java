class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> nums = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        int[] rowMin = new int[row];
        int[] colMax = new int[col];

        for(int i =0; i<row; i++){
            rowMin[i] = Integer.MAX_VALUE;
            for(int j =0; j<col; j++){
                if(matrix[i][j]<rowMin[i]){
                    rowMin[i] = matrix[i][j];
                }
            }
        }

        for(int j =0; j<col; j++){
            colMax[j] = Integer.MIN_VALUE;
            for(int i = 0; i<row;i++){
                if(matrix[i][j]>colMax[j]) colMax[j] = matrix[i][j];
            }

        }

          for(int i =0; i<row; i++){
           
            for(int j =0; j<col; j++){
                if(matrix[i][j]==rowMin[i] && matrix[i][j] == colMax[j]){
                    nums.add(matrix[i][j]);
                }
            }
        }
        return nums;

    }
}