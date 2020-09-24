let greetUser = function () {

}

/*
  undefined - null
  */

//multiple arguments & argument defaults
let getScoreText = function (name = 'Anonymous', score = 0) {
    console.log(name);
    console.log(score);
}

getScoreText();


//Chalenge

let getTip = function (total = 0, tipPercent = 0.1) {
    return total * (tipPercent + 1);
}

let tip = getTip(100);

console.log(tip);