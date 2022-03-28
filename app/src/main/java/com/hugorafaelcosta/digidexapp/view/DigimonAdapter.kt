package com.hugorafaelcosta.digidexapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hugorafaelcosta.digidexapp.R
import com.hugorafaelcosta.digidexapp.domain.Digimon

class DigimonAdapter(
    val items: List<Digimon>
) : RecyclerView.Adapter<DigimonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.digimon_item,parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView() {

        }
    }


}