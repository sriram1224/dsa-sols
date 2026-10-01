var search = function(nums, target) {
    for(let val in nums) {
        if(nums[val] === target) return val;
    }
    return -1;
};