package com.annaginagili.guessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.annaginagili.guessapp.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    lateinit var binding: ActivityProfileBinding
    lateinit var notifications: ImageView
    lateinit var settings: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityProfileBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        notifications = binding.notifications
        settings = binding.settings

        notifications.setOnClickListener {
            startActivity(Intent(this, Notifications::class.java))
        }

        settings.setOnClickListener {
            startActivity(Intent(this, Settings::class.java))
        }
    }
}