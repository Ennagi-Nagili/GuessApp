package com.annaginagili.guessapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.annaginagili.guessapp.databinding.FragmentInboxBinding
import com.annaginagili.guessapp.databinding.ToolBarBinding

class InboxFragment : Fragment() {
    lateinit var binding: FragmentInboxBinding
    lateinit var toolbar: ToolBarBinding
    lateinit var recycler: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInboxBinding.inflate(inflater)
        toolbar = binding.toolbar
        recycler = binding.recycler

        toolbar.homeTxt.text = "Inbox"

        recycler.setHasFixedSize(true)
        recycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        val headList = mutableListOf("Clairvoyance Preparing...", "Akif - fortune telling",
        "Clairvoyance Reading")
        val dateList = mutableListOf("19/07/2021  08:51:41 - 7HR9EY9L02",
            "19/07/2021  08:51:41 - 7HR9EY9L02", "19/07/2021  08:51:41 - 7HR9EY9L02")
        val typeList = mutableListOf("normal", "tell", "else")
        recycler.adapter = InboxAdapter(requireContext(), headList, dateList, typeList)

        return binding.root
    }
}