package com.annaginagili.guessapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.annaginagili.guessapp.databinding.LibraStuffBinding

class LibraAdapter(private val context: Context, private val textList: List<String>):
    RecyclerView.Adapter<LibraAdapter.ItemHolder>() {
    class ItemHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!) {
        fun setData(text: String, context: Context) {
            val binding =  LibraStuffBinding.bind(itemView)
            binding.text.text = text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view: View? = LayoutInflater.from(context).inflate(R.layout.libra_stuff, parent, false)
        return ItemHolder(view!!)
    }

    override fun getItemCount(): Int {
        return textList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.setData(textList[position], context)
    }
}