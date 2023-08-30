package com.annaginagili.guessapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.annaginagili.guessapp.databinding.FragmentPalmistryBinding

class PalmistryFragment : Fragment() {
    lateinit var binding: FragmentPalmistryBinding
    lateinit var recycler: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPalmistryBinding.inflate(inflater)

        recycler = binding.recycler

        recycler.setHasFixedSize(true)
        recycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        val imageList = mutableListOf(R.drawable.human1, R.drawable.human2, R.drawable.human3,
            R.drawable.human4, R.drawable.human5, R.drawable.human6)
        val nameList = mutableListOf("Aleyna", "Tarık", "Azra", "Pınar", "Ahmet", "Nermin")
        val timeList = mutableListOf(30, 30, 30, 30, 30, 30)
        val percentList = mutableListOf(85, 75, 70, 65, 50, 30)
        recycler.adapter = PalmistryAdapter(requireContext(), PalItem.getData(nameList, imageList,
            timeList, percentList))

        return binding.root
    }
}