package com.test

import grails.transaction.Transactional

@Transactional
class NoteService {

    def getStaticNote() {
        return new Note(author: "Anonymous", content: "Real Programmers Don't eat Quiche")
    }

    def getRandomNote(){
        def allNotes = Note.list()
        def randomNote
        if(allNotes.size()>0){
            def randomIdx = new Random().nextInt(allNotes.size())
            randomNote = allNotes[randomIdx]
        }
        else{
            randomNote = getStaticNote()
        }
        return randomNote
    }
}
