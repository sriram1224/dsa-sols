/**
 * @param {number[]} gas
 * @param {number[]} cost
 * @return {number}
 */
var canCompleteCircuit = function(gas, cost) {
    let totalTankGas = 0;
    let currentTank = 0;
    let startStation = 0;

    for (let i = 0; i < gas.length; i++) {
        const fuelDifference = gas[i] - cost[i];
        totalTankGas += fuelDifference;
        currentTank += fuelDifference;

        if (currentTank < 0) {
            startStation = i + 1;
            currentTank = 0;
        }
    }

    return totalTankGas < 0 ? -1 : startStation;
};