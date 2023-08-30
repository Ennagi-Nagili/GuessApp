package com.annaginagili.guessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.annaginagili.guessapp.databinding.ActivityFaqMainBinding
import com.annaginagili.guessapp.databinding.ToolBarBinding

class FaqMain : AppCompatActivity() {
    lateinit var binding: ActivityFaqMainBinding
    lateinit var toolBar: ToolBarBinding
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFaqMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        toolBar = binding.toolbar
        recyclerView = binding.recycler

        toolBar.homeTxt.text = "FAQ"
        toolBar.image.visibility = View.GONE

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val headList = mutableListOf("Lorem ipsum", "Lorem ipsum", "Lorem ipsum", "Lorem ipsum",
            "Lorem ipsum", "Lorem ipsum")
        val answerList = ArrayList<String>()
        for (i in 0 until 6) {
            answerList.add("It is a long established fact that a reader will be distracted by the " +
                    "readable content of a page when looking at its layout. The point of using Lorem " +
                    "Ipsum is that it has a more-or-less normal distribution of letters, as opposed " +
                    "to using 'Content here, content here', making it look like readable English. " +
                    "Many desktop publishing packages and web page editors now use Lorem Ipsum as " +
                    "their default model text, and a search for 'lorem ipsum' will uncover many web " +
                    "sites still in their infancy. Various versions have evolved over the years, " +
                    "sometimes by accident, sometimes on purpose (injected humour and the like).")
        }
        recyclerView.adapter = FaqAdapter(this, headList, answerList)
    }
}