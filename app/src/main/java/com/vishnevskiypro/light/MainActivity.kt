package com.vishnevskiypro.light

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.vishnevskiypro.light.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var flashClass: Flash

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        flashClass = Flash(context = this)

        binding.buttonOn.setOnClickListener{
            flashClass.flashOff()
            binding.buttonOn.isVisible = false
            binding.buttonOff.isVisible = true
        }

        binding.buttonOff.setOnClickListener{
            flashClass.flashOn()
            binding.buttonOff.isVisible = false
            binding.buttonOn.isVisible = true
        }
    }

}