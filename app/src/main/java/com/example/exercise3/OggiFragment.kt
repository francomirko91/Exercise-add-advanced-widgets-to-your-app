package com.example.exercise3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.exercise3.databinding.FragmentOggiBinding

class OggiFragment : Fragment() {

    private var _binding: FragmentOggiBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentOggiBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
            binding.primo.text = binding.terzo.text
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
