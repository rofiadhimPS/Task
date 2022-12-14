package com.d121201014.task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.d121201014.task.databinding.ActivityMainBinding
import com.d121201014.task.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}