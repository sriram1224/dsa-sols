class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> nums = new ArrayList<>();
        int col_max = Integer.MIN_VALUE;
        
        for(int i =0; i<matrix.length; i++){
            int row_min = Integer.MAX_VALUE;;

            for(int j =0; j<matrix[0].length;j++){
                if(matrix[i][j]<row_min) row_min = matrix[i][j];
                
            }
            if(row_min>col_max){
                col_max = row_min;
            }
            
  

        }
        nums.add(col_max);
        

        return nums;
    }
}