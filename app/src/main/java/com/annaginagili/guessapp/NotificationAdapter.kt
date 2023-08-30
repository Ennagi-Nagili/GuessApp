package com.annaginagili.guessapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.annaginagili.guessapp.databinding.NotificationLayoutBinding
import com.annaginagili.guessapp.databinding.PalmistryLayoutBinding

class NotificationAdapter(private val context: Context, private val headList: List<String>,
                          private val imageList: List<Int>, private val dateList: List<String>):
    RecyclerView.Adapter<NotificationAdapter.ItemHolder>() {
    class ItemHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!) {
        fun setData(head: String, image: Int, date: String, context: Context) {
            val binding =  NotificationLayoutBinding.bind(itemView)
            binding.bell.setImageResource(image)
            binding.head.text = head

            itemView.setOnClickListener {
                val intent1 = Intent(context, NotificationDetails::class.java)
                intent1.putExtra("head", head)
                intent1.putExtra("date", date)
                context.startActivity(intent1)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view: View? = LayoutInflater.from(context).inflate(R.layout.notification_layout, parent, false)
        return ItemHolder(view!!)
    }

    override fun getItemCount(): Int {
        return headList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.setData(headList[position], imageList[position], dateList[position], context)
    }
}