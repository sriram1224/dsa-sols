class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;
        int m = image.length;
        for(int i = 0; i<m; i++){
            int left = 0, right = n-1;
            while(left<=right){
                int temp = image[i][right]^1;
                image[i][right] = image[i][left]^1;
                image[i][left] = temp;
                left++;
                right--;
            }

        }
        return image;
    }
}