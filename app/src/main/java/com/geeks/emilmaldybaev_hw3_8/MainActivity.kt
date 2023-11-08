package com.geeks.emilmaldybaev_hw3_8

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geeks.emilmaldybaev_hw3_8.databinding.ActivityMainBinding
import com.geeks.emilmaldybaev_hw3_8.databinding.FragmentMainBinding
import com.geeks.emilmaldybaev_hw3_8.databinding.ItemRickBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainFragment = MainFragment()

        //supportFragmentManager.beginTransaction().replace(R.id.fragment_container,mainFragment).commit()
    }
}
