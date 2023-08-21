package com.example.navigation2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigation2.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentDetailBinding.inflate(layoutInflater, container, false)

        val bundle: DetailFragmentArgs by navArgs()
        val getName: String = bundle.name
        val getNumber = bundle.number

        val getPerson = bundle.person

        Log.e("Name:", getName)
        Log.e("Number", getNumber.toString())
        Log.e("Name:", getPerson.name)
        Log.e("Number", getPerson.number.toString())


        binding.buttonFinish.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_detailFragment_to_resultFragment)
        }

        return binding.root
    }


}