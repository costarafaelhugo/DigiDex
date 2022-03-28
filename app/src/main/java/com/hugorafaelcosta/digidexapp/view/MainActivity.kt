package com.hugorafaelcosta.digidexapp.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hugorafaelcosta.digidexapp.R
import com.hugorafaelcosta.digidexapp.domain.Digimon

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewDigimons)

        val agumon = Digimon(
            "https://digimon.shadowsmith.com/img/agumon.jpg",
            "Rookie",
            "Agumon"
        )
        val digimons = listOf(
            agumon, agumon, agumon, agumon, agumon
        )

        val layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = DigimonAdapter(digimons)
    }
}