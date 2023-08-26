package com.example.deezerapp.album

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.deezerapp.R
import com.example.deezerapp.databinding.FragmentAlbumBinding

class AlbumFragment : Fragment() {


    private val viewModel by viewModels<AlbumViewModel>()
    private lateinit var binding:FragmentAlbumBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentAlbumBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view:View, savedInstanceState: Bundle?) {

    }

}