class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxarea = 0; 
        int minh = 0;
        int w = 0;

        for(int i =0; i<n; i++){
            for(int j =i; j<n; j++){
                w = j-i;
                minh = Math.min(height[i],height[j]);
                int area = minh * w;
                maxarea = Math.max(maxarea,area);


            }
        }
        return maxarea;
    }
}