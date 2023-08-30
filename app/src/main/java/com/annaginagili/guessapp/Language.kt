package com.annaginagili.guessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.Toolbar
import com.annaginagili.guessapp.databinding.ActivityLanguageBinding
import com.annaginagili.guessapp.databinding.ToolBarBinding

class Language : AppCompatActivity() {
    lateinit var binding: ActivityLanguageBinding
    lateinit var toolbar: ToolBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLanguageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        toolbar = binding.toolbar

        toolbar.homeTxt.text = "Language"
        toolbar.image.visibility = View.GONE
    }
}