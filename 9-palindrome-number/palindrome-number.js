/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    
   // x = Math.abs(x);


    let original = x; 
    let rev = 0 ;

    while(x > 0){
        let last = x % 10;
        rev  = 10*rev + last;
        x = Math.floor(x/10)
    }

    if(rev === original){
        return true;
    }else{
       return false;
    }
};