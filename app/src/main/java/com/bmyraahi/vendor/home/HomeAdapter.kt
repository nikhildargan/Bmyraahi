package com.bmyraahi.vendor.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bmyraahi.vendor.R
import kotlinx.android.synthetic.main.item_home.view.*

class HomeAdapter( var items: ArrayList<HomeItem>) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {


    data class HomeItem(val resource: Int, val name: String) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false))
    }



    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
       holder.bind(items.get(position))
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: HomeItem) = with(itemView) {
            tvItem.text = item.name
            ivItem.setBackgroundResource(item.resource)
        }
    }
}
