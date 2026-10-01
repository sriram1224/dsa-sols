class Solution {
    public int findClosestNumber(int[] nums) {
        int nearby = nums[0];
        for(int i = 0; i<nums.length; i++){
            int element = nums[i];
            nearby = Math.min(Math.abs(element),Math.abs(nearby));
            nearby = (Math.abs(element)==Math.abs(nearby)) ? (element<nearby ? element : nearby) : nearby;
        }

        return nearby;

    }
}