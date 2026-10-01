class Solution {
    public int maximumWealth(int[][] accounts) {
        int rows = accounts[0].length;
        int cols = accounts.length;
        int max = Integer.MIN_VALUE;


        for(int i = 0; i<cols; i++){
            int sum = 0;

            for(int j = 0; j<rows; j++){
                sum += accounts[i][j];
            }
            max = Math.max(sum,max);


        }
        return max;
    }
}