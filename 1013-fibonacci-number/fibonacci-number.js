/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    //base case
    // if(n===0) return 0;
    // if(n===1) return 1;

    if(n<2) return n;

    // return fib(n-1)+fib(n-2);

    let prev=1, secPrev=0,curr;

    while(n>=2){
     
    curr = prev + secPrev
    secPrev = prev
    prev = curr
    
    n--;
        
    }
    return prev;
};