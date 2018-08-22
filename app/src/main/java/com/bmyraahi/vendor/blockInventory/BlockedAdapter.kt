package com.bmyraahi.vendor.blockInventory

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bmyraahi.vendor.R
import com.bmyraahi.vendor.inventory.Inventory
import kotlinx.android.synthetic.main.item_blocked.view.*

class BlockedAdapter(var items: ArrayList<Inventory>) : RecyclerView.Adapter<BlockedAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlockedAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_blocked, parent, false))
    }



    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: BlockedAdapter.ViewHolder, position: Int) {
       holder.bind(items.get(position))
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Inventory) = with(itemView) {
            tvTitle.text = item.name
        }
    }
}
