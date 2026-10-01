class Solution {
    public int[] searchRange(int[] nums, int target) {
        int count = 0;
        int[] positions  = new int[2];
        for(int i =0; i<nums.length; i++){
            if(nums[i] == target){
                if(count == 0) positions[0] = i;
                else positions[1] = i;
                count ++;
                
            }
            
        }
        if(count <=0){
            positions[0] = -1;
            positions[1] = -1;
        } 
        return positions;
    }
}