/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let currSum = 0;
    let maxSum = -Infinity;
    if(nums.length===1)
    {
        return nums[0];
    }
    for(let i =0; i<nums.length;i++){
         currentSum += nums[i]
           if (maxSum < currentSum) {
            maxSum = currentSum
        }

         if(currentSum < 0){
             currentSum =0
         }

    }
    return maxSum
    };