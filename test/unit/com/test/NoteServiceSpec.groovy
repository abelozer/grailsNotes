package com.test

import grails.test.mixin.*
import spock.lang.*

@TestFor(NoteService)
@Mock(Note)
class NoteServiceSpec extends Specification {

    void testReturnStaticNoteReturnsQuicheNote() {
        Note staticNote = service.getStaticNote()
        assertEquals("Anonymous", staticNote.author)
        assertEquals("Real Programmers Don't eat Quiche", staticNote.content)
    }
}
