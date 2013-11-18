import com.test.Note

class BootStrap {

    def init = { servletContext ->
        def firstNote = Note.findByAuthor("Test1") ?: new Note(
                author: "Test1",
                content: "Austin is going to be so Hot",
                createdOn: new Date(1234)
        ).save(failOnError: true)

        def secondNote = Note.findByAuthor("Test2") ?: new Note(
                author: "Test2",
                content: "I loved my weekend in Miami",
                createdOn: new Date(1234)
        ).save(failOnError: true)
    }

    def destroy = {
    }
}
