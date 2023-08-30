package com.annaginagili.guessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.annaginagili.guessapp.databinding.ActivityCoffeCupBinding

class TarotCards : AppCompatActivity() {
    lateinit var binding: ActivityCoffeCupBinding
    lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarot_cards)
        binding = ActivityCoffeCupBinding.inflate(layoutInflater)

        recycler = binding.recycler

        recycler.setHasFixedSize(true)
        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val imageList = mutableListOf(R.drawable.human1, R.drawable.human2, R.drawable.human3,
            R.drawable.human4, R.drawable.human5, R.drawable.human6)
        val nameList = mutableListOf("Aleyna", "Tarık", "Azra", "Pınar", "Ahmet", "Nermin")
        val timeList = mutableListOf(30, 30, 30, 30, 30, 30)
        val percentList = mutableListOf(85, 75, 70, 65, 50, 30)
        recycler.adapter = PalmistryAdapter(this, PalItem.getData(nameList, imageList,
            timeList, percentList))
    }
}