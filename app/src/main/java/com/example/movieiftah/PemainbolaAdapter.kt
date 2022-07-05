package com.example.movieiftah

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PemainbolaAdapter(private val context: Context, private val pemainbola: List<Pemainbola>, val listener: (Pemainbola)-> Unit)
    : RecyclerView.Adapter<PemainbolaAdapter.PemainbolaViewHolder>(){
    class PemainbolaViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imgpemainbola = view.findViewById<ImageView>(R.id.img_item_photo)
        val namepemainbola = view.findViewById<TextView>(R.id.tv_item_name)
        val descpemainbola = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(pemainbola: Pemainbola, listener: (Pemainbola) ->Unit) {
            imgpemainbola.setImageResource(pemainbola.imgPemainbola)
            namepemainbola.text = pemainbola.namePemainbola
            descpemainbola.text = pemainbola.descPemainbola
            itemView.setOnClickListener{
                listener(pemainbola)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PemainbolaViewHolder {
        return PemainbolaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_pemainbola, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PemainbolaViewHolder, position: Int) {
        holder.bindView(pemainbola[position], listener)
    }

    override fun getItemCount(): Int = pemainbola.size
}
