/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let n = nums.length;
    let total =  n*(n+1)/2;
     
    let sumArr =  nums.reduce((curr , next)=>{
     return curr + next;
    } , 0)

    return total - sumArr;
};