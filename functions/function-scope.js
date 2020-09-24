
//Global scope(convertFtoC, one, two)
    //Local scope(c,f)
        //Local scope(isFreezing)


let convertFtoC = function (f) {
    let c = (f - 32) * 5 / 9;

    if (c <= 0) {
        let isFreezing = true;
    }

    return c;
}

let one = convertFtoC(10);
let two = convertFtoC(20);

console.log(one);
console.log(two);