package com.test

class Note {
    String content
    String author
    Date createdOn

    static constraints = {
        author(blank:false)
        content(maxSize: 1000, blank: false)
    }
}
