package com.annaginagili.guessapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.annaginagili.guessapp.databinding.FaqLayoutBinding
import com.annaginagili.guessapp.databinding.InboxLayoutBinding

class FaqAdapter(private val context: Context, private val headList: List<String>, private val answerList: List<String>):
    RecyclerView.Adapter<FaqAdapter.ItemHolder>() {
    class ItemHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!) {
        fun setData(context: Context, head: String, answer: String) {
            val binding =  FaqLayoutBinding.bind(itemView)
            binding.head.text = head

            itemView.setOnClickListener {
                val intent1 = Intent(context, Faq::class.java)
                intent1.putExtra("head", head)
                intent1.putExtra("answer", answer)
                context.startActivity(intent1)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view: View? = LayoutInflater.from(context).inflate(R.layout.faq_layout, parent, false)
        return ItemHolder(view!!)
    }

    override fun getItemCount(): Int {
        return headList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.setData(context, headList[position], answerList[position])
    }
}