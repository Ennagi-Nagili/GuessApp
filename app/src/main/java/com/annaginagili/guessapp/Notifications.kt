package com.annaginagili.guessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.annaginagili.guessapp.databinding.ActivityNotificationsBinding
import com.annaginagili.guessapp.databinding.ToolBarBinding

class Notifications : AppCompatActivity() {
    lateinit var binding: ActivityNotificationsBinding
    lateinit var toolbar: ToolBarBinding
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityNotificationsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        toolbar = binding.toolbar
        recyclerView = binding.recycler

        toolbar.homeTxt.text = "Notifications"

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val headList = mutableListOf("Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry.")
        val imageList = mutableListOf(R.drawable.bell1, R.drawable.bell2, R.drawable.bell2)
        val dateList = mutableListOf("19/07/2021  08:51:41", "19/07/2021  08:51:41", "19/07/2021  08:51:41")
        recyclerView.adapter = NotificationAdapter(this, headList, imageList, dateList)
    }
}