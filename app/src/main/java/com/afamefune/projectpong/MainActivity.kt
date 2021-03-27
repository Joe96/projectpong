package com.afamefune.projectpong

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.afamefune.projectpong.adapters.VideoGameAdapter
import com.afamefune.projectpong.viewmodel.VideoGame


class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var arrayList:ArrayList<VideoGame> ? = null
    private var gridView:GridView ? = null
    private var videoGameAdapter: VideoGameAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inits gridview, array, and adapter
        gridView = findViewById(R.id.gridView)
        arrayList = ArrayList()
        arrayList = setDataList()
        videoGameAdapter = VideoGameAdapter(applicationContext, arrayList!!)

        gridView?.adapter = videoGameAdapter
        gridView?.onItemClickListener = this

    }

    // Populate array with mock data
    private fun setDataList() : ArrayList<VideoGame> {

        var arrayList: ArrayList<VideoGame> = ArrayList()

        arrayList.add(VideoGame("Biomutant",R.mipmap.ic_launcher,"05-25-2021"))

        arrayList.add(VideoGame("Ratchet & Clank: Rift Apart",R.mipmap.ic_launcher,"06-11-2021"))

        arrayList.add(VideoGame("Monster Hunter Stories 2: Wings of Ruin",R.mipmap.ic_launcher,"07-09-2021"))

        arrayList.add(VideoGame("The Legend of Zelda: Skyward Sword HD",R.mipmap.ic_launcher,
            "07-16-2021"))

        arrayList.add(VideoGame("Kena: Bridge of Spirits",R.mipmap.ic_launcher,"08-24-2021"))

        arrayList.add(VideoGame("Stray",R.mipmap.ic_launcher,"10-31-2021"))


        return arrayList
    }

    // Sets click listener on the items in the gridview.
    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items: VideoGame = arrayList!!.get(position)
        // Sets toast message when item is clicked
        Toast.makeText(applicationContext, items.title, Toast.LENGTH_SHORT).show()
        // Intent opens detailed activity when item is clicked
        val intent = Intent(this, DetailedActivity::class.java)
        intent.putExtra("position", position)
        this.startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)

        }

    }

}