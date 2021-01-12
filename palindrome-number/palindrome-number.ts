function isPalindrome(x: number): boolean {
    var result = parseInt(x.toString().split('').reverse().join(''));
    if (result > 0x7FFFFFFF) {
        return false
    }
    Math.sign(x) * result
    if (result == x) {
        return true
    }else {
        return false
    }
};



console.log(isPalindrome(121))