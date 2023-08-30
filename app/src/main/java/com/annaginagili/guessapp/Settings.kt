package com.annaginagili.guessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.annaginagili.guessapp.databinding.ActivitySettingsBinding
import com.annaginagili.guessapp.databinding.FragmentInboxBinding

class Settings : AppCompatActivity() {
    lateinit var binding: ActivitySettingsBinding
    lateinit var faq: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        faq = binding.faq

        faq.setOnClickListener {
            startActivity(Intent(this, FaqMain::class.java))
        }
    }
}