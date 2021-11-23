package com.pjurado.ej0303

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.String
import java.util.*

class MyAdapter(private val directory: ArrayList<Destino>, private val context: Context) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.item_grid_destino, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.setText(directory[position].name)
        holder.image.setImageResource(directory[position].image)
        holder.name.setOnClickListener {
            val uri = String.format(
                Locale.ENGLISH,
                "geo:%f,%f",
                directory[position].latitude,
                directory[position].longitude
            )
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            context.startActivity(intent)
        }
        holder.image.setOnClickListener {
            val uri = String.format(
                Locale.ENGLISH,
                "geo:%f,%f",
                directory[position].latitude,
                directory[position].longitude
            )
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return directory.size
    }

class MyViewHolder(var myView: View) : RecyclerView.ViewHolder(
        myView
    ) {
        var name: TextView
        var image: ImageView

        init {
            name = myView.findViewById(R.id.textViewName)
            image = myView.findViewById(R.id.imageViewCity)
        }
    }
}
