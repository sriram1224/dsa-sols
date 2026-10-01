class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
       int count =0;
       int n = nums.length;
        for(int i =n-1; i>0; i--){
            if(nums[i] != nums[i-1]){
                count++;
            }
            if(count==2){
                return nums[i-1];
            }
           
        } return count<2?nums[n-1]:nums[0];
    }
}