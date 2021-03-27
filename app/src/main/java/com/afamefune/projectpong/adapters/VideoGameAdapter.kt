package com.afamefune.projectpong.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.afamefune.projectpong.R
import com.afamefune.projectpong.viewmodel.VideoGame

class VideoGameAdapter (var context: Context, var arrayList: ArrayList<VideoGame>) : BaseAdapter () {



    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view : View = View.inflate(context, R.layout.game_list, null)
        val titles : TextView = view.findViewById(R.id.title)
        val icons : ImageView = view.findViewById(R.id.icon)
        val dates : TextView = view.findViewById(R.id.release_date)


        /*val about : TextView = detailedView.findViewById(R.id.detailed_about)
        val genre : TextView = detailedView.findViewById(R.id.detailed_genre)
        val publishers : TextView = detailedView.findViewById(R.id.detailed_publisher)
        val platforms : TextView = detailedView.findViewById(R.id.detailed_platform)
        val esrb_ratings : TextView = detailedView.findViewById(R.id.detailed_esrb_rating)
         */
        val listItem : VideoGame = arrayList.get(position)

        titles.text = listItem.title
        icons.setImageResource(listItem.image!!)
        dates.text = listItem.releaseDate
        /*about.text = listItem.about
        genre.text = listItem.genre
        publishers.text = listItem.publisher
        platforms.text = listItem.platform
        esrb_ratings.text = listItem.ersb_rating
         */


        return view
    }

    override fun getItem(position: Int): Any {
        return arrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }
}
