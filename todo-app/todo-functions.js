'use strict'
//Fetch existing todos from localStorage
const getSavedTodos = function () {
    const todosJSON = localStorage.getItem('todos');

    try {
        return todosJSON !== null ? JSON.parse(todosJSON) : [];
    } catch (e) {
        return [];
    }
}

//Save todos to localStorage
const saveTodos = function (todos) {
    localStorage.setItem('todos', JSON.stringify(todos));
}

//Render application todos based on filters
const renderTodos = function (todos, filters) {
    console.log(filters);
    let filterTodos = todos.filter(function (todo) {
        return todo.text.toLowerCase().includes(filters.searchText.toLowerCase())
    })

    filterTodos = filterTodos.filter(function (todo) {
        //debugger  
        return !filters.hideCompleted || !todo.completed;
        // if (filters.hideCompleted) {
        //     return !todo.completed
        // } else {
        //     return true;
        // }
    })


    document.querySelector("#todos").innerHTML = '';
    document.querySelector("#todos").appendChild(generateSummaryDOM());

    filterTodos.forEach(function (todo) {
        document.querySelector("#todos").appendChild(generateTodoDOM(todo));
    })
}

//Remove todo
const removeTodo = function (id) {
    const todoIndex = todos.findIndex(function (todo) {
        return todo.id === id;
    })
    if (todoIndex > -1) {
        todos.splice(todoIndex, 1);
    }
}

const toggleTodo = function (todo) {
    todo.completed = !todo.completed;
}

//Get the DOM elements for an invidual note
const generateTodoDOM = function (todo) {
    const todoEl = document.createElement('div');
    const checkBoxEl = document.createElement('input');
    const textEl = document.createElement('span');
    const button = document.createElement('button');

    //Checkbox
    checkBoxEl.setAttribute('type', 'checkbox');
    checkBoxEl.checked = todo.completed;
    checkBoxEl.addEventListener('change', function () {
        //todo.completed = this.checked;
        toggleTodo(todo);
        saveTodos(todos);
        renderTodos(todos, filters);
    })


    todoEl.appendChild(checkBoxEl);

    //Text
    textEl.textContent = todo.text;
    todoEl.appendChild(textEl);

    //Remove button
    button.textContent = 'x';
    todoEl.appendChild(button);
    button.addEventListener('click', function () {
        removeTodo(todo.id);
        saveTodos(todos);
        renderTodos(todos, filters);
    })

    return todoEl;
}

//Get the DOM elements for list summary
const generateSummaryDOM = function () {
    const incompleteTodos = todos.filter(function (todo) {
        return !todo.completed;
    })

    const summary = document.createElement('h2')
    summary.textContent = `You have ${incompleteTodos.length} todos left`
    return summary
}