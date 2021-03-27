package com.afamefune.projectpong

import android.os.Bundle
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import com.afamefune.projectpong.adapters.VideoGameAdapter
import com.afamefune.projectpong.viewmodel.VideoGame

class DetailedActivity : AppCompatActivity() {

    private var arrayList:ArrayList<VideoGame> ? = null
    private var videoGameAdapter: VideoGameAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detailed)



    }
}