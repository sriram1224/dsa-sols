/**
 * @param {string} s
 * @return {string}
 */
var removeDuplicates = function(s) {
    let arr = [];
    for(let i of s){
        if(arr[arr.length-1]==i) arr.pop();
        else{
            arr.push(i);
        }
    }
    return arr.join('');
};