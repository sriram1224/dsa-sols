/**
 * @param {number[]} gas
 * @param {number[]} cost
 * @return {number}
 */
var canCompleteCircuit = function(gas, cost) {
   let n = gas.length

    let start = n - 1
    let end = 0
    gasInTank = gas[start] - cost[start]
    while (start >= end) {
        if (gasInTank >= 0) {
            gasInTank += gas[end] - cost[end]
            end++
        }
        else {
            start--
            gasInTank += gas[start] - cost[start]
        }
    }
    return gasInTank >= 0 ? start : -1
};