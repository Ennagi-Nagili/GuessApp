package com.annaginagili.guessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import com.annaginagili.guessapp.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    lateinit var language: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        language = binding.language

        language.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item,
            mutableListOf("Language", "Azerbaijani", "Turkish", "English", "Russian", "Arabic"))
        language.setSelection(0)
    }
}