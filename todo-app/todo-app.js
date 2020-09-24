let todos = getSavedTodos();

const filters = {
    searchText: '',
    hideCompleted: false
}

renderTodos(todos, filters);

document.querySelector('#search-text').addEventListener('input', function (e) {
    filters.searchText = e.target.value;
    renderTodos(todos, filters)
})

document.querySelector('#new-todo').addEventListener('submit', function (e) {
    e.preventDefault();

    todos.push({        
        id: uuidv4(),
        text: e.target.elements.text.value,
        completed: false
    })
    renderTodos(todos, filters);
    saveTodos(todos);

    e.target.elements.text.value = '';
})

document.querySelector('#hide-completed').addEventListener('change', function (e) {
    console.log(e.target.checked);
    filters.hideCompleted = e.target.checked;
    
    renderTodos(todos, filters);
})