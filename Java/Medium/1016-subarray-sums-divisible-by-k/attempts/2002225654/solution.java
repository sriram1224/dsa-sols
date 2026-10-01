class Solution {
    public int subarraysDivByK(int[] nums, int k) {
                 int nums_len = nums.length;

int count = 0;

        for(int i = 0; i<nums_len; i++){
            int sum = 0;
            for(int j = i; j<nums_len; j++){



                    sum+= nums[j];

                int rem = sum%k;
                if(rem<0) rem += k;
                if(rem==0) count++;

            }


        }

        return count;
    }
}