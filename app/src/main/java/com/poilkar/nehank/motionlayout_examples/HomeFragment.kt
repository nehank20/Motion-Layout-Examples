package com.poilkar.nehank.motionlayout_examples

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.poilkar.nehank.motionlayout_examples.databinding.HomeFragmentBinding

class HomeFragment : Fragment(R.layout.home_fragment) {

    lateinit var binding: HomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = HomeFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        setOnClickListeners()
    }

    private fun init() {

    }

    private fun setOnClickListeners(){
        binding.cvBasic.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToBasicFragmentOne()
            findNavController().navigate(action)
        }
    }
}