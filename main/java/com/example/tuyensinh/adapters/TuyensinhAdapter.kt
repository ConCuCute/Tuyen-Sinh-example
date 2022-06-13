package com.example.tuyensinh.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.tuyensinh.R
import com.example.tuyensinh.model.TuyensinhModel
import android.content.Intent
import androidx.core.content.ContextCompat
import com.example.tuyensinh.MainActivity
import com.example.tuyensinh.SecondActivity


class TuyensinhAdapter(var context: Context, var arrayList: ArrayList<TuyensinhModel>):
    RecyclerView.Adapter<TuyensinhAdapter.ItemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val viewHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_view_layout_tuyensinh, parent, false)
        return ItemHolder(viewHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        val tsModel: TuyensinhModel = arrayList.get(position)

        holder.icons.setImageResource(tsModel.icons!!)
        holder.icons.setOnClickListener {
            if (position == 1) {
                val intent = Intent(context, SecondActivity::class.java)
                holder.icons.context.startActivity(intent)
            }
        }

    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var icons = itemView.findViewById<ImageView>(R.id.icon_image_view)

    }
}