const noteId = location.hash.substring(1)
let notes = getSaveNotes();
let note = notes.find(function (note) {
    return note.id === noteId;
})

if (note === undefined) {
    location.assign('/index.html');
}

const noteTitle = document.querySelector('#note-title');
const noteBody = document.querySelector('#note-body');
const btnRemove = document.querySelector('#remove-note');
const dateElement = document.querySelector('#last-edited');
dateElement.textContent=generateLastEdited(note.updatedAt);

noteTitle.value = note.title;
noteBody.value = note.body;

noteTitle.addEventListener('change', function (e) {
    note.title = e.target.value;
    note.updatedAt = moment().valueOf();
    dateElement.textContent=generateLastEdited(note.updatedAt);
    saveNotes(notes);
})

noteBody.addEventListener('change', function (e) {
    note.body = e.target.value;
    note.updatedAt = moment().valueOf();
    dateElement.textContent=generateLastEdited(note.updatedAt);
    saveNotes(notes);
})

btnRemove.addEventListener('click', function () {
    removeNote(note.id);
    saveNotes(notes);
    location.assign('/index.html');
})

window.addEventListener('storage', function (e) {
    if (e.key === 'notes') {
        notes = JSON.parse(e.newValue);
        notes = getSaveNotes();
        note = notes.find(function (note) {
            return note.id === noteId;
        })

        if (note === undefined) {
            location.assign('/index.html');
        }

        noteTitle.value = note.title;
        noteBody.value = note.body;
    }
})
