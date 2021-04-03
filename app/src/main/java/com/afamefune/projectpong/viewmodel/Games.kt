package com.afamefune.projectpong.viewmodel

class Games {
    var name: String? = null
    var image: Int? = null
    var released: String? = null
    var description: String? = null
    var developers: String? = null
    var genres: String? = null
    var esrb_rating: String? = null
    var platforms: String? = null

    constructor(name: String, image: Int, released: String , description: String, developers: String, genres: String, platforms: String, esrb_rating: String) {

        this.name = name
        this.image = image
        this.released = released
        this.description = description
        this.developers = developers
        this.genres = genres
        this.esrb_rating = esrb_rating
        this.platforms = platforms
    }
}