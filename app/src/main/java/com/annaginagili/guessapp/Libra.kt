package com.annaginagili.guessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.annaginagili.guessapp.databinding.ActivityLibraBinding
import com.annaginagili.guessapp.databinding.ActivityTarotChooseBinding
import com.annaginagili.guessapp.databinding.ToolBarBinding

class Libra : AppCompatActivity() {
    lateinit var binding: ActivityLibraBinding
    lateinit var tool_bar: ToolBarBinding
    lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLibraBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        tool_bar = binding.toolbar
        tool_bar.homeTxt.text = "Libra"
        recycler = binding.recycler

        recycler.setHasFixedSize(true)
        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val textList = mutableListOf("YESTERDAY", "TODAY", "TOMORROW", "WEEKLY", "MONTHLY", "2021")
        recycler.adapter = LibraAdapter(this, textList)
    }
}