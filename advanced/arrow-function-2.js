const add = function (a, b) {
    console.log(arguments);
}

add(11, 22, 33, 44);

const car = {
    color: 'Red',
    getSummary() {
        return `The car is ${this.color}`
    }
}

console.log(car.getSummary())