/**
 * @param {number[]} gas
 * @param {number[]} cost
 * @return {number}
 */
var canCompleteCircuit = function(gas, cost) {
    
    let n = gas.length;
    let total_surplas = 0;
    let surplus = 0;
    let s = 0;

    for(let i=0; i < gas.length; i++){
        total_surplas += gas[i] - cost[i];
        surplus+= gas[i]-cost[i];
        if(surplus < 0){
            surplus = 0;
            s = i+1;
        }
    }
    return total_surplas < 0 ? -1: s;
};