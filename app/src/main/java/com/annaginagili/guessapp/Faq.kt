package com.annaginagili.guessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.TextView
import com.annaginagili.guessapp.databinding.ActivityFaqBinding
import com.annaginagili.guessapp.databinding.ToolBarBinding
import kotlinx.coroutines.internal.LockFreeLinkedListHead

class Faq : AppCompatActivity() {
    lateinit var binding: ActivityFaqBinding
    lateinit var toolBar: ToolBarBinding
    lateinit var head: TextView
    lateinit var answer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFaqBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        toolBar = binding.toolbar
        head = binding.head
        answer = binding.answer

        toolBar.homeTxt.text = "FAQ"
        toolBar.image.visibility = View.GONE

        head.text = intent.getStringExtra("head")
        answer.text = intent.getStringExtra("answer")
    }
}