package com.irving.boilerplate.presentation.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.irving.boilerplate.R
import com.irving.boilerplate.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    val viewModel by viewModels<HomeViewModel>()
    private lateinit var binding: HomeFragmentBinding
    val navController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false)
        setUpView()
        return binding.root
    }

    private fun setUpView(){
        binding.btnGo.setOnClickListener {
            navController.navigate(HomeFragmentDirections.actionHomeFragmentToSettingsFragment())
        }
    }
}