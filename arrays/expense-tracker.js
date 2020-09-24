const account = {
    name: 'Duy Pham',
    income: [],
    expense: [],
    addExpense: function (description, amount) {
        this.expense.push({
            description: description,
            amount: amount
        })
    },
    addIncome: function (description, amount) {
        this.income.push({
            description: description,
            amount: amount
        })
    },
    getAccountSummary: function () {
        let totalIncome = 0;
        let totalExpense = 0;
        let balance = 0;

        this.income.forEach(function (income) {
            balance += income.amount;
            totalIncome += income.amount;
        })

        this.expense.forEach(function (expense) {
            balance -= expense.amount;
            totalExpense += expense.amount;
        })

        return `${this.name} has a balance of $${balance}. $${totalIncome} in income. $${totalExpense} in expense.`;
    }
}

account.addExpense('Rent', 950);
account.addExpense('Coffee', 2);
account.addIncome('Job', 1000);
console.log(account.getAccountSummary());
