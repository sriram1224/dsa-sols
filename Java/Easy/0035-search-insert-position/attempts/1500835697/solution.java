class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        
            
    int index =0;
        for(int i =0; i<n; i++){
            if(nums[i] == target) return i;
            if(target>nums[i]) index = i+1;
            else return index;
        }

        return index;
    }
}