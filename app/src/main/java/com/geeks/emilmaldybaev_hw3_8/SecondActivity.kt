package com.geeks.emilmaldybaev_hw3_8

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.geeks.emilmaldybaev_hw3_8.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        binding.tvName.text = name
        val status = intent.getStringExtra("status")
        binding.tvStatus.text = status
        val photo = intent.getStringExtra("photo")
        Glide.with(binding.ivPhoto.context).load(photo).into(binding.ivPhoto)

    }
}
