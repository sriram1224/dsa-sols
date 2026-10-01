class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[][] matrix = new int[m][n];
      for(int[] index : indices){
        int row = index[0];
        int col = index[1];

        for(int i = 0; i<n;i++){
           matrix[row][i]++;
      }
      for(int i = 0; i<m;i++){
           matrix[i][col]++;
      }

      
 
    }
    for(int[] odd: matrix){
        for(int i: odd){
            if(i%2!=0) count++;

        }
      }
         return count;
    }
}