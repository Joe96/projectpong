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
        var view : View = View.inflate(context, R.layout.game_list, null)
        var icons : ImageView = view.findViewById(R.id.icon)
        var titles : TextView = view.findViewById(R.id.title)
        var dates : TextView = view.findViewById(R.id.date)

        var listItem : VideoGame = arrayList.get(position)

        titles.text = listItem.title
        icons.setImageResource(listItem.image!!)
        dates.text = listItem.releaseDate


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
