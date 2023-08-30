package com.annaginagili.guessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.annaginagili.guessapp.databinding.ActivityMessageBinding
import com.annaginagili.guessapp.databinding.ToolBarBinding

class Message : AppCompatActivity() {
    lateinit var binding: ActivityMessageBinding
    lateinit var toolbar: ToolBarBinding
    lateinit var head: TextView
    lateinit var date: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMessageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        toolbar = binding.toolbar
        head = binding.head
        date = binding.date

        toolbar.homeTxt.text = "Message"
        toolbar.image.setImageResource(R.drawable.trash)

        head.text = intent.getStringExtra("head")
        date.text = intent.getStringExtra("date")
    }
}