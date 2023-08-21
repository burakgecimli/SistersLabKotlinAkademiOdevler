package com.example.navigation2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigation2.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        val person = Person("Arthur", 30)

        binding.buttonStart.setOnClickListener {

            val action =
                HomeFragmentDirections.actionHomeFragmentToDetailFragment(person,12,"James",)
            Navigation.findNavController(it).navigate(action)


        }

        return binding.root
    }


}