class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        
        int[] newArray = new int[n*2];
        for(int i = 0; i<n; i++){
            newArray[i] = nums[i];
            newArray[i+n] = nums[i];
        }

        return newArray;
    }
}