package com.hardsoftday.drinklist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BebidaAdapter(val bebidaList: ArrayList<Bebida>) : RecyclerView.Adapter<BebidaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.drinks, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(bebidaList[position])
    }

    override fun getItemCount(): Int {
        return bebidaList.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(bebida:Bebida) {
            val name:TextView = itemView.findViewById<TextView>(R.id.name) as TextView
            val desc = itemView.findViewById<TextView>(R.id.desc) as TextView
            val image = itemView.findViewById<ImageView>(R.id.imageUrl)

            name.text = bebida.name.toString()
            desc.text = bebida.description.toString()
            image.setImageResource(bebida.imageUrl)

        }
    }

}