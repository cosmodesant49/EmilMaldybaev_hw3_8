package com.geeks.emilmaldybaev_hw3_8

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geeks.emilmaldybaev_hw3_8.databinding.ActivityMainBinding
import com.geeks.emilmaldybaev_hw3_8.databinding.FragmentMainBinding
import com.geeks.emilmaldybaev_hw3_8.databinding.ItemRickBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val rickList = arrayListOf(
        Rick("https://e7.pngegg.com/pngimages/286/70/png-clipart-rick-sanchez-morty-smith-pocket-mortys-rick-morty.png", "alive", "Rick"),
        Rick("https://i.pinimg.com/originals/66/83/da/6683da6fc8f5321d2dcb6023e03df4fb.png", "alive", "Morty"),
        Rick("https://i.pinimg.com/originals/d1/aa/a7/d1aaa727cb4a94a4385f67b54e4bf5e6.png", "alive", "Jerry")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = RickAdapter(rickList, this::onClick)
        binding.rvRick.adapter = adapter
    }
        private fun onClick (rick :Rick) {
            val intent = Intent(requireActivity(), SecondActivity::class.java)
            intent.putExtra("name", rick.name)
            intent.putExtra("status", rick.status)
            intent.putExtra("photo", rick.photo)
            startActivity(intent)
        }
}
