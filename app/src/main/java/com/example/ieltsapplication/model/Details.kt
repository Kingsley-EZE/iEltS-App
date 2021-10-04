package com.example.ieltsapplication.model

class Details {
    var title : String? = null
    var desc : String? = null
    var image: Int? = null

    constructor(title : String, desc : String, Image : Int) {
        this.title = title
        this.desc = desc
        this.image = Image
    }
}