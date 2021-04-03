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
import com.afamefune.projectpong.viewmodel.Games

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var arrayList:ArrayList<Games> ? = null
    private var gridView:GridView ? = null
    private var videoGameAdapter: VideoGameAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        // Inits gridview, array, and adapter
        gridView = findViewById(R.id.gridView)
        arrayList = ArrayList()
        arrayList = setDataList()
        videoGameAdapter = VideoGameAdapter(applicationContext, arrayList!!)

        gridView?.adapter = videoGameAdapter
        gridView?.onItemClickListener = this

        //fetchJson()

    }

    // Populate array with mock data
    private fun setDataList() : ArrayList<Games> {

        var arrayList: ArrayList<Games> = ArrayList()

        arrayList.add(Games("Biomutant",R.mipmap.ic_launcher,"05-25-2021",
            getString(R.string.biomutant_description), "Experiment 101", "Action, RPG",
            "PlayStation 4, PC, Xbox One", "NR"))

        arrayList.add(Games("Ratchet & Clank: Rift Apart",R.mipmap.ic_launcher,"06-11-2021",
             getString(R.string.ratchet_description), "Insomniac Games", "Action, Adventure",
            "PlayStation 5", "NR"))

        arrayList.add(Games("Monster Hunter Stories 2: Wings of Ruin", R.mipmap.ic_launcher,"07-09-2021",
            getString(R.string.monsterhunter_description), "Capcom", "RPG","Nintendo Switch, PC",
            "NR"))

        arrayList.add(Games("The Legend of Zelda: Skyward Sword HD",R.mipmap.ic_launcher, "07-16-2021",
            getString(R.string.zelda_description), "Nintendo", "Action, Adventure", "Nintendo Switch",
            "NR"))

        arrayList.add(Games("Kena: Bridge of Spirits",R.mipmap.ic_launcher,"08-24-2021",
            getString(R.string.kena_description), "Ember Lab", "Action, Shooter, Adventure, Strategy",
            "PlayStation 5, PlayStation 4, PC", "Everyone 10+"))

        arrayList.add(Games("Stray",R.mipmap.ic_launcher,"10-31-2021",
            getString(R.string.stray_description ), "BlueTwelve", "Action, Adventure",
            "PC, PlayStation 5", "NR"))


        return arrayList
    }

    // Sets click listener on the items in the gridview.
    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items: Games = arrayList!!.get(position)


        // Sets toast message when item is clicked
        Toast.makeText(applicationContext, items.name, Toast.LENGTH_SHORT).show()

        // Intent opens detailed activity when item is clicked
        val intent = Intent(this, DetailedActivity::class.java)

        intent.putExtra("name", items.name)
        intent.putExtra("released", items.released)
        intent.putExtra("platforms", items.platforms)
        intent.putExtra("description", items.description)
        intent.putExtra("developers", items.developers)
        intent.putExtra("genres", items.genres)
        intent.putExtra("esrb_rating", items.esrb_rating)

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