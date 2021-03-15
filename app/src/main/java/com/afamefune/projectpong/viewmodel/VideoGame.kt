package com.afamefune.projectpong.viewmodel

class VideoGame {
    var title: String? = null
    var image: Int? = null
    var releaseDate: String? = null

    constructor(title: String, image: Int, releaseDate: String) {

        this.title = title
        this.image = image
        this.releaseDate = releaseDate
    }
}