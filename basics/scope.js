//Global Scope (varOne)
//Local Scope (varTwo)
//Local Scope (varThree)
//Local Scope (varFour)

let varOne = 1;

if (true) {
    let varTwo = 2;
    if (true) {
        let varThree = 3;
    }
}

if (true) {
    let varFour = 4;
}

//always use LET to init a variable to avoid leaked global variable ?//