function reverse(x) {
    var result = parseInt(x.toString().split('').reverse().join(''));
    if (result > 0x7FFFFFFF) {
        return 0;
    }
    return Math.sign(x) * result;
}
;
console.log(reverse(321));
