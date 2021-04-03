package com.afamefune.projectpong

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val gameName = intent.getStringExtra("name").toString()
        val gameReleased = intent.getStringExtra("released").toString()
        val gamePlatforms = intent.getStringExtra("platforms").toString()
        val gameDescription = intent.getStringExtra("description").toString()
        val gameDeveloper = intent.getStringExtra("developers").toString()
        val gameGenres = intent.getStringExtra("genres").toString()
        val gameESRBRating = intent.getStringExtra("esrb_rating").toString()


        var viewName: TextView=findViewById(R.id.name)
        viewName.text = gameName

        var viewReleased: TextView=findViewById(R.id.released)
        viewReleased.text = gameReleased

        var viewPlatform: TextView=findViewById(R.id.platforms)
        viewPlatform.text = gamePlatforms

        var viewDescription: TextView=findViewById(R.id.description)
        viewDescription.text = gameDescription

        var viewDeveloper: TextView=findViewById(R.id.developer)
        viewDeveloper.text = gameDeveloper

        var viewGenres: TextView=findViewById(R.id.genres)
        viewGenres.text = gameGenres

        var viewESRBRating: TextView=findViewById(R.id.esrb_rating)
        viewESRBRating.text = gameESRBRating

    }

}