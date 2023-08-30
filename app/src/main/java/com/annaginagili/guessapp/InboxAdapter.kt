package com.annaginagili.guessapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.annaginagili.guessapp.databinding.InboxLayoutBinding
import com.annaginagili.guessapp.databinding.LibraStuffBinding

class InboxAdapter(private val context: Context, private val headList: List<String>, private val dateList: List<String>,
private val typeList: List<String>): RecyclerView.Adapter<InboxAdapter.ItemHolder>() {
    class ItemHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!) {
        fun setData(context: Context, head: String, date: String, type: String) {
            val binding =  InboxLayoutBinding.bind(itemView)
            binding.head.text = head
            binding.date.text = date

            itemView.setOnClickListener {
                if (type == "tell") {
                    val intent1 = Intent(context, Message2::class.java)
                    intent1.putExtra("head", head)
                    intent1.putExtra("date", date)
                    context.startActivity(intent1)
                }
                else {
                    val intent1 = Intent(context, Message::class.java)
                    intent1.putExtra("head", head)
                    intent1.putExtra("date", date)
                    context.startActivity(intent1)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view: View? = LayoutInflater.from(context).inflate(R.layout.inbox_layout, parent, false)
        return ItemHolder(view!!)
    }

    override fun getItemCount(): Int {
        return headList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.setData(context, headList[position], dateList[position], typeList[position])
    }
}