package com.test

class NoteController {
    static scaffold = true
    def noteService

    def index() {
        Note.list()
    }

    def home(){
        render "<h1>Real Programmers do not eat Quiche</h1>"
    }

    def random(){
        def randomNote = noteService.getRandomNote()
        [ note: randomNote]
    }

    def ajaxRandom() {
        def randomNote = noteService.getRandomNote()
        render {
            q(randomNote.content)
            p(randomNote.author)
        }
    }
}
