package com.annaginagili.guessapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.annaginagili.guessapp.databinding.FragmentHoroscopeBinding

class HoroscopeFragment : Fragment() {
    lateinit var binding: FragmentHoroscopeBinding
    lateinit var libra: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHoroscopeBinding.inflate(inflater)
        libra = binding.libra

        libra.setOnClickListener {
            startActivity(Intent(requireContext(), Libra::class.java))
        }

        return binding.root
    }
}