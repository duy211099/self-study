let name = ' Xuan Duy ';

console.log(name.length);

console.log(name.toUpperCase());

console.log(name.toLowerCase());

let password = 'abc123password098';
console.log(password.includes('password'));

console.log(name.trim());

//Documentation: mdn

//Challenge

let checkPassword = function (password) {
    return !password.includes('password') && password.length >= 8;
}

console.log(checkPassword('asdfp'));
console.log(checkPassword('abc123!@#$%^&*('));
console.log(checkPassword('asdfpfdsapassword'));