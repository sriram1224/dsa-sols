class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int curr  = 0;
        for(int i = 0; i<n; i++){
        curr += nums[i];
        arr[i] = curr;
        }

        return arr;

    }
}