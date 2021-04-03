package com.afamefune.projectpong.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.afamefune.projectpong.R
import com.afamefune.projectpong.viewmodel.Games

class VideoGameAdapter (var context: Context, var arrayList: ArrayList<Games>) : BaseAdapter () {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view : View = View.inflate(context, R.layout.game_list, null)
        val titles : TextView = view.findViewById(R.id.name)
        val icons : ImageView = view.findViewById(R.id.icon)
        val dates : TextView = view.findViewById(R.id.released)

        val listItem : Games = arrayList.get(position)

        titles.text = listItem.name
        icons.setImageResource(listItem.image!!)
        dates.text = listItem.released

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
