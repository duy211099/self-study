let myBook = {
    title: '1984',
    author: 'George Orwell',
    pageCount: 326
}

let otherBook = {
    title: 'A Peoples History',
    author: 'Howard Zinn',
    pageCount: 723
}

let getSummary = function (book) {
    return {
        summary: `${book.title} by ${book.author}.`,
        pageCountSummary: `${book.title} is ${book.pageCount} pages long.`
    }
}

console.log(getSummary(myBook));

//Challenge

let convertFahreheit = function (f) {
    return {
        celsius: (f - 32) * (5 / 9),
        fahrenheit: f,
        kevin: (f + 459.67) * 5 / 9
    }
}

console.log(convertFahreheit(74));