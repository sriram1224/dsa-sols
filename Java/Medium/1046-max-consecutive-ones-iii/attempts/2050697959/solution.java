class Solution {
    public int longestOnes(int[] nums, int k) {
         int n = nums.length;
         int l = 0;
         int max =0;
        for(int i = 0; i<n; i++){
            int z = 0;
            for(int j =i; j<n; j++){
                if(nums[j] == 0) z++;
                    if(z<=k){
                     l = j-i+1;   
                     max = Math.max(max,l);
                    }
                    else break;
                
            }
        }
        return max;
    }
}