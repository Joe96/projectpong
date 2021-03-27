package com.afamefune.projectpong.viewmodel

class VideoGame {
    var title: String? = null
    var image: Int? = null
    var releaseDate: String? = null
    var about: String? = null
    var publisher: String? = null
    var genre: String? = null
    var ersb_rating: String? = null
    var platform: String? = null

    constructor(title: String, image: Int, releaseDate: String/*, about: String, publisher: String, genre: String, platform: String*/) {

        this.title = title
        this.image = image
        this.releaseDate = releaseDate
        this.about = about
        this.publisher = publisher
        this.genre = genre
        this.ersb_rating = ersb_rating
        this.platform = platform
    }
}