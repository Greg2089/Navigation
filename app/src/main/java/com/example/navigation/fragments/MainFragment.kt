package com.example.navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation.R

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bF1 = view.findViewById<Button>(R.id.button)
        val bF2 = view.findViewById<Button>(R.id.button2)
        bF1.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_oneFragment)
        }
        bF2.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_twoFragment)
        }
    }
}
