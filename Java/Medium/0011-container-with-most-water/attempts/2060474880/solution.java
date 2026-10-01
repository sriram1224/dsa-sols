class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxarea = 0; 
        int minh = 0;
        int w = 0;

        int l = 0; 
        int r = n-1;

      while(l<r){
                w = r-l;
                minh = Math.min(height[l],height[r]);
                int area = minh * w;
                maxarea = Math.max(maxarea,area);
            if(height[l] < height[r] ) l++;
            else r--;
      }

        return maxarea;
    }
}