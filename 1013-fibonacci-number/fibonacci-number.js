/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    //base case
    // if(n===0) return 0;
    // if(n===1) return 1;

    if(n<2) return n;

    return fib(n-1)+fib(n-2);
    
};