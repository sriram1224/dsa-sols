class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> map = new PriorityQueue<>();
        for(int i =0; i<matrix.length; i++){
            for(int j=0; j<matrix.length[i]; j++){
                map.offer(matrix[i][j]);

            }
        }

        for(int i =0; i<k-1; i++){
            map.poll();
        }
        return map.peak();
    }
}