class Solution {
    public int countNegatives(int[][] grid) {
        int negative = 0; 
        int n = grid.length;
        int m = grid[0].length;
        int row = 0, col = m-1;
        int count = 0;
       while(row<n && col>=0){
        if(grid[row][col]<0){
            count += (n-row);
            col--;
        }
        else row++;
       }
        return count;
    }
}