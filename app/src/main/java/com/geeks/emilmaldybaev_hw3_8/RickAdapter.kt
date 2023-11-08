package com.geeks.emilmaldybaev_hw3_8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geeks.emilmaldybaev_hw3_8.databinding.ItemRickBinding

class RickAdapter(val rickList: List<Rick>, val onClick:(rick:Rick)->Unit) : RecyclerView.Adapter<RickAdapter.ViewHolder>() {

    private lateinit var binding: ItemRickBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRickBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        this.binding = binding
        return ViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return rickList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //val rick = rickList[position]
        //Glide.with(binding.ivPhoto.context).load(rick.photo).into(binding.ivPhoto)
        //binding.tvStatus.text = rick.status
        //binding.tvName.text = rick.name

        holder.bind(rickList[position])


    }



    inner class ViewHolder(private val binding: ItemRickBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(rick: Rick) {
            Glide.with(binding.ivPhoto.context).load(rick.photo).into(binding.ivPhoto)
            binding.tvStatus.text = rick.status
            binding.tvName.text = rick.name

            itemView.setOnClickListener {
                onClick(rick)
            }
        }
    }
}
