class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        int[][] flipped = new int[n][m];
        for(int i =0; i<n; i++){
            for(int j = 0; j<m;j++){
                if(image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;
            }
            
           
        }
         for(int[] row: image){
            int start = 0;
            int end = row.length-1;
            while(start<end){
                int temp = row[start];
                row[start] = row[end];
                row[end] = temp;
                start++;
                end--;
            }
            
         }
        return image;
        
    }
}