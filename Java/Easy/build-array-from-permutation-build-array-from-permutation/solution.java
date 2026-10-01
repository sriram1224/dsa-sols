class Solution {
    public int[] buildArray(int[] nums) {
        int[] newArray = new int[nums.length];
int temp = 0;
        for(int i = 0; i<nums.length; i++ ){
            temp = nums[i];
            newArray[i] = nums[temp];
        }

        return newArray;
    }
}