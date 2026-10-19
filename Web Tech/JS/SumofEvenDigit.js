let n = 12345;
let esum = 0;
while (n > 0) {
    let rem = n % 10;
    if (rem % 2 == 0) {
        esum += rem;
    }
        n=Math.trunc(n/10);
}
console.log(esum);