class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        // Fill the first half of ans with the elements of nums
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }
        
        // Fill the second half of ans with another copy of nums
        for (int i = 0; i < n; i++) {
            ans[i + n] = nums[i];
        }
        
        return ans;
    }
}
