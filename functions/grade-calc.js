let gradeCalc = function (score = 0, total = 20) {
    let percent = score / total * 100;

    if (percent >= 90) {
        console.log(`You got an A (${percent}%)!`);
    } else if (percent >= 80) {
        console.log(`You got a B (${percent}%)!`);
    } else if (percent >= 70) {
        console.log(`You got a C (${percent}%)!`);
    } else if (percent >= 60) {
        console.log(`You got a D (${percent}%)!`);
    } else {
        console.log(`You got a F (${percent}%)!`);
    }
}

gradeCalc(30, 100);
gradeCalc(18);
gradeCalc(6, 10);

//=============================
//=============================
//=============================

// students score, total possible score
// 15/20 -> You got a C (75%)!
// A 90-100, B 80-89, C 70-79, D 60-69, F 0-59

let gradeCalcR = function (score, totalScore) {
    if (typeof score === 'number' && typeof totalScore === 'number') {

        let percent = (score / totalScore) * 100
        let letterGrade = ''

        if (percent >= 90) {
            letterGrade = 'A'
        } else if (percent >= 80) {
            letterGrade = 'B'
        } else if (percent >= 70) {
            letterGrade = 'C'
        } else if (percent >= 60) {
            letterGrade = 'D'
        } else {
            letterGrade = 'F'
        }

        return `You got a ${letterGrade} (${percent}%)!`
    } else {
        throw Error('Please provide numbers only');
    }
}

try {
    let result = gradeCalcR(19, 'a')
    console.log(result)
} catch (e) {
    console.log(e.message);
}