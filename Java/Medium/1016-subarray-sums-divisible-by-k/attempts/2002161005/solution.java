class Solution {
    public int subarraysDivByK(int[] nums, int k) {
               int nums_len = nums.length;

int count = 0;
        for(int i = 0; i<nums_len; i++){

            for(int j = i; j<nums_len; j++){
                int sum = 0;
                for(int p = i; p<=j; p++){

                    sum+= nums[p];
                }
                int rem = sum%k;
               
                if(rem==0){

                count++;
                }
                
            }
            

        }

        return count;
        
    }
}