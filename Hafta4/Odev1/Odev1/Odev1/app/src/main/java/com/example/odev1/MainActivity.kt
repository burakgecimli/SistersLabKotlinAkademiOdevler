package com.example.odev1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.doOnLayout
import androidx.core.widget.doOnTextChanged
import com.example.odev1.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button.setOnClickListener {
            val name: String = binding.editTextName.text.toString()
            val number: String = binding.editTextPhone.text.toString()

            if (name.isEmpty()) {
                binding.textInputLayout.error = "You can not an empty value!"
            } else if (number.isEmpty()) {
                binding.textInputLayout2.error = "You can not an empty value!"
            } else {

                Toast.makeText(this, "Save succesfully", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, ActionActivity::class.java)
                startActivity(intent)
            }
        }


    }


}