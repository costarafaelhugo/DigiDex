package com.hugorafaelcosta.digidexapp.view

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hugorafaelcosta.digidexapp.R
import com.hugorafaelcosta.digidexapp.domain.Digimon

class DigimonAdapter(
    private val items: List<Digimon>
) : RecyclerView.Adapter<DigimonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.digimon_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("SetTextI18n")
        fun bindView(item: Digimon) = with(itemView) {
            val digimonImageView = findViewById<ImageView>(R.id.digimonImageView)
            val digimonNameTextView = findViewById<TextView>(R.id.digimonNameTextView)
            val digimonLevelTextView = findViewById<TextView>(R.id.digimonLevelTextView)

            //TODO: Load image with Glide

            digimonNameTextView.text = "Nome ${item.name}"
            digimonLevelTextView.text = "Level ${item.level}"
        }
    }
}