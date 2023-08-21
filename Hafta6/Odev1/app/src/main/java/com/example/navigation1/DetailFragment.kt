package com.example.navigation1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigation1.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDetailBinding.inflate(layoutInflater, container, false)

        val bundle: DetailFragmentArgs by navArgs()
        val getPerson = bundle.person

        binding.apply {
            textViewEmail.text = getPerson.email
        }

        return binding.root
    }


}