package com.annaginagili.guessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import com.annaginagili.guessapp.databinding.ActivityTarotChooseBinding
import com.annaginagili.guessapp.databinding.ToolBarBinding

class TarotChoose : AppCompatActivity() {
    lateinit var binding: ActivityTarotChooseBinding
    lateinit var tool_bar: ToolBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTarotChooseBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        tool_bar = binding.toolbar
        tool_bar.homeTxt.text = "Tarot Cards"
    }
}