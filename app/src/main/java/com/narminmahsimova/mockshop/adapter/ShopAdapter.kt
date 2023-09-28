package com.narminmahsimova.mockshop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.narminmahsimova.mockshop.databinding.RowLayoutBinding
import com.narminmahsimova.mockshop.model.ShopModel

class ShopAdapter(private val shopProdList:ArrayList<ShopModel>,private val listener : Listener):RecyclerView.Adapter<ShopAdapter.RowHolder>() {

    class RowHolder(val binding: RowLayoutBinding): RecyclerView.ViewHolder(binding.root) {

    }

    interface Listener {
        fun onItemClick(shopModel: ShopModel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val binding = RowLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return RowHolder(binding)
    }

    override fun getItemCount(): Int {
        return shopProdList.size
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.itemView.setOnClickListener {
            listener.onItemClick(shopProdList.get(position))
        }

        holder.binding.prodName.text = shopProdList.get(position).title
        holder.binding.prodPrice.text = shopProdList.get(position).price
        //holder.binding.imageView3.setImageResource()

    }
}