/**
 * @param {number[]} gas
 * @param {number[]} cost
 * @return {number}
 */
var canCompleteCircuit = function(gas, cost) {
    let start = gas.length;
    let end  = 0;
    gasIntank = gas[start]-gas[end]
    while(start >= end){
        if(gasIntank>=0){
            gasIntank += gas[end] - cost[end];
            end++;
        }
        else{
            start--;
            gasIntank += gas[start]-cost[start];
        }
    }return gasIntank >0 ? start:-1;
};