package com.annaginagili.guessapp

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toolbar
import com.annaginagili.guessapp.databinding.ActivityNotificationDetailsBinding
import com.annaginagili.guessapp.databinding.ToolBarBinding

class NotificationDetails : AppCompatActivity() {
    lateinit var binding: ActivityNotificationDetailsBinding
    lateinit var toolbar: ToolBarBinding
    lateinit var head: TextView
    lateinit var date: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityNotificationDetailsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        toolbar = binding.toolbar
        head = binding.head
        date = binding.date

        toolbar.homeTxt.text = "Notifications"
        toolbar.image.visibility = View.GONE

        head.text = intent.getStringExtra("head")
        date.text = intent.getStringExtra("date")
    }
}