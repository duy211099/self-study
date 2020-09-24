let num = 103.5;

console.log(num.toFixed(2));

console.log(Math.round(num));
console.log(Math.floor(num));
console.log(Math.ceil(num));

let min = 10;
let max = 20;
let randomNum = Math.floor(Math.random() * (max - min + 1)) + min;
console.log(randomNum);

//Challenge area

let makeGuess = function (num) {
    console.log(Math.floor(Math.random() * 5) + 1);
    return num == Math.floor(Math.random() * 5) + 1;
}

console.log(makeGuess(1));

