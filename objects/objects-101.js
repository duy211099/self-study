let myBook = {
    title: '1984',
    author: 'George Orwell',
    pageCount: 326
}

myBook.title='Animal Farm';

console.log(myBook);
console.log(myBook.title);
console.log(`${myBook.title} by ${myBook.author}`);

//Challenge area

let me = {
    name:'Duy',
    age: 21,
    location:'Dalat'
}

console.log(`${me.name} is ${me.age} and lives in ${me.location}.`);

me.age+=1;
console.log(`${me.name} is ${me.age} and lives in ${me.location}.`);