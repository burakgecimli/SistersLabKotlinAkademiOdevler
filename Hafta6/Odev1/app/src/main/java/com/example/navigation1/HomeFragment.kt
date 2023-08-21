package com.example.navigation1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.navigation1.databinding.FragmentHomeBinding
import com.google.android.material.snackbar.Snackbar


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        binding.buttonSignIn.setOnClickListener {

            val email = binding.editTextEmail.text.toString()
            val password = binding.editTextPassword.text.toString()


            if (email.trim().isEmpty() || password.trim().isEmpty()) {
                Toast.makeText(requireContext(), "Empty value", Toast.LENGTH_SHORT).show()
            } else {
                val person = Person(email,password)
                val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(person)
                Navigation.findNavController(it).navigate(action)
            }

        }
        return binding.root
    }


}