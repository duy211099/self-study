let myAccount = {
    name: 'Andrew Mead',
    expense: 0,
    income: 0
}

let addExpense = function (account, amount) {
    account.expense += amount;
}

// Challenge 

let addIncome = function (account, amount) {
    account.income += amount;
}

let resetAccount = function (account) {
    account.income = account.expense = 0;
}

let getAccountSummary = function (account) {
    return `Account for ${account.name} has $${account.income - account.expense}. 
            $${account.income} in income. 
            $${account.expense} in expense.`;
}


addExpense(myAccount, 2.5);
addIncome(myAccount, 10000);
console.log(getAccountSummary(myAccount));
resetAccount(myAccount);

console.log(myAccount);