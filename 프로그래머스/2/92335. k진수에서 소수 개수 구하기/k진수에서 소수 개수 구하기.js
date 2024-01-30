function solution(n, k) {
    let count = 0;
    n.toString(k).split("0")
     .map((num) => {
        if (isPrime(Number(num))) {
            count++;
        }
    });
    return count;
}

function isPrime(num) {
    if (num <= 1) {
        return false;
    }
    for (let i=2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) {  
            return false;
        }
    }
    return true;
}