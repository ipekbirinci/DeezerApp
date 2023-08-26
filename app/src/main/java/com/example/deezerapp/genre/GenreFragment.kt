package com.example.deezerapp.genre

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.deezerapp.databinding.FragmentGenreBinding


class GenreFragment : Fragment() {


    private val viewModel by viewModels<GenreViewModel>()
    private lateinit var  binding: FragmentGenreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       // binding = FragmentDetailBinding.inflate(inflater, container, false)
       // return binding.root
        binding=FragmentGenreBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view:View, savedInstanceState: Bundle?) {



    }


}







































