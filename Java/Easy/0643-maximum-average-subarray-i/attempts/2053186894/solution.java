class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = k-1;
        double psum = 0;
        for(int i = 0; i<k; i++){
            psum += nums[i];
        }
        double avg = 0;
        double max = psum;
        double sum = 0;
        while(r<n-1){
        sum = (psum-nums[l])+nums[r+1];
        psum = sum;
        avg = sum/k;
        max = Math.max(avg,max);
        l++;
        r++;
        }


        return max;
    }
}