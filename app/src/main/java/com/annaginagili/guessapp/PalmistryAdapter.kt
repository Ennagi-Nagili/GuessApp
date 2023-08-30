package com.annaginagili.guessapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.annaginagili.guessapp.databinding.PalmistryLayoutBinding

class PalmistryAdapter(private val context: Context, private val itemList: List<PalItem>):
    RecyclerView.Adapter<PalmistryAdapter.ItemHolder>() {
    class ItemHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!) {
        fun setData(item: PalItem, context: Context) {
            val binding =  PalmistryLayoutBinding.bind(itemView)
            binding.image.setImageResource(item.image!!)
            binding.name.text = item.name
            binding.time.text = item.time
            binding.percent.text = item.percent
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view: View? = LayoutInflater.from(context).inflate(R.layout.palmistry_layout, parent, false)
        return ItemHolder(view!!)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.setData(itemList[position], context)
    }
}