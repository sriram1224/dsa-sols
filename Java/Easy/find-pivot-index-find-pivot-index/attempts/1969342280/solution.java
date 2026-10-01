class Solution {
    public int pivotIndex(int[] nums) {
        int tsum = 0;
     for(int i : nums) tsum+=i;

    int leftsum = 0;
     for(int i = 0; i<nums.length; i++){
        if(leftsum == tsum-leftsum-nums[i]){
            return i;
        }
        leftsum+= nums[i];
     }
return -1;
       
       
        
    }
}