/**
 * @param {number[]} gas
 * @param {number[]} cost
 * @return {number}
 */
var canCompleteCircuit = function(gas, cost) {
     let start = gas.length - 1;
    let end = 0;
    let gasInTank = gas[start] - cost[start];

    while (start > end) {
        if (gasInTank >= 0) {
            gasInTank += gas[end] - cost[end];
            end++;
        } else {
            start--;
            gasInTank += gas[start] - cost[start];
        }
    }

    return gasInTank >= 0 ? start : -1;
};