package com.example.ej8pantallarazas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ej8pantallarazas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.elfo)
        }

        binding.button2.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.humano)
        }

        binding.button3.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.enano)
        }

        binding.button4.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.goblin)
        }

        binding.button5.setOnClickListener {
            Intent(this, MainActivity2::class.java).also {
                startActivity(it)
            }
        }
    }
}