const todos = [{
    text: 'Homework',
    completed: false
}, {
    text: 'Household chore',
    completed: true
}, {
    text: 'Cat',
    completed: false
}, {
    text: 'Yo',
    completed: true
}, {
    text: 'Walk',
    completed: false
},];

// todos.splice(2, 1);
// todos.push('New item in the end');
// todos.shift();

// console.log(`You have ${todos.length} todoss.`);
// console.log(`todos: - ${todos[todos.length - 2]}`);
// console.log(`todos: - ${todos[todos.length - 3]}`);

// todos.forEach(function (item, index) {
//     console.log(`${index + 1}. ${item}`);
// })

// for (let i = 0; i < todos.length; i++) {
//     console.log(`${i + 1}. ${todos[i]}.`);
// }

const deleteTodo = function (todos, text) {
    let index = todos.findIndex(function (item, index) {
        return item.text === text;
    });

    index > -1 ? todos.splice(index, 1) : null;
}

// deleteTodo(todos, 'Cat');
// console.log(todos)

const getThingsToDo = function (todos) {
    return todos.filter(function (item) {
        return !item.completed;
    });
}

//console.log(getThingsToDo(todos));

const sortTodos = function (todos) {
    todos.sort(function (a, b) {
        if (a.completed === false && b.completed === true)
            return -1;
        else if (a.completed === true && b.completed === false)
            return 1;
        else 
            return 0;
    });
}

sortTodos(todos);
console.log(todos);
