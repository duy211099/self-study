const getSaveNotes = () => {
    const noteJSON = localStorage.getItem('notes');

    try {
        return noteJSON !== null ? JSON.parse(noteJSON) : [];
    } catch (e) {
        return [];
    }
    //console.log(noteJSON);

}

// Remove a note
const removeNote = (id) => {
    const noteIndex = notes.findIndex((note) => note.id === id)

    console.log(noteIndex);
    noteIndex > -1 ? notes.splice(noteIndex, 1) : null
}

//Generate the Dom structure for a note
const generateNoteDOM = (note) => {
    const noteEl = document.createElement('div');
    const textEl = document.createElement('a');
    const button = document.createElement('button');

    //Setup the remove note button
    button.textContent = 'x';
    noteEl.appendChild(button);
    button.addEventListener('click', function () {
        removeNote(note.id);
        saveNotes(notes);
        renderNotes(notes, filters)
    })

    //setup the note title text 
    note.title.length > 0 ? textEl.textContent = note.title : textEl.textContent = 'Unnamed note'

    textEl.setAttribute('href', `/edit.html#${note.id}`);

    noteEl.appendChild(textEl);

    return noteEl;
}

//Save the notes to localStorage
const saveNotes = (notes) => {
    localStorage.setItem('notes', JSON.stringify(notes))
}

const sortNotes = (notes, sortBy) => {
    if (sortBy === 'byEdited') {
        return notes.sort((a, b) => {
            if (a.updatedAt > b.updatedAt) {
                return -1;
            } else if (a.updatedAt < b.updatedAt) {
                return 1;
            } else {
                return 0;
            }
        });
    } else if (sortBy === 'byCreated') {
        return notes.sort(function (a, b) {
            if (a.createdAt > b.createdAt) {
                return -1;
            } else if (a.createdAt < b.createdAt) {
                return 1;
            } else {
                return 0;
            }
        });
    } else if (sortBy = 'alphabetical') {
        return notes.sort(function (a, b) {
            if (a.title.toLowerCase() < b.title.toLowerCase()) {
                return -1;
            } else if (a.title.toLowerCase() > b.title.toLowerCase()) {
                return 1;
            } else {
                return 0;
            }
        })
    } else {
        return notes;
    }
}

//Render application notes
const renderNotes = (notes, filters) => {
    console.log(notes);
    notes = sortNotes(notes, filters.sortBy);
    const filterNotes = notes.filter(function (note) {
        return note.title.toLowerCase().includes(filters.searchText.toLowerCase());
    })

    document.querySelector('#notes').innerHTML = '';

    filterNotes.forEach((note) => {
        const noteEl = generateNoteDOM(note);
        document.querySelector('#notes').appendChild(noteEl);
    })
}

const generateLastEdited = (timestamp) => `Last edited at ${moment(timestamp).fromNow()}`;
