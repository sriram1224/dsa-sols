class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int mL = 0;
        int mR = 0, water = 0;
        while(l<r){
            if(height[l]<=height[r]){
                mL = Math.max(mL,height[l]);
                water += mL - height[l];
                l++;

            }
            else{
                mR = Math.max(mR,height[r]);
                water += mR - height[r];
                r--;
            }
        }
        return water;

        
    }
}