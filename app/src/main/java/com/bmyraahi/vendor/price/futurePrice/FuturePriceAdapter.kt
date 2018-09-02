package com.bmyraahi.vendor.price.futurePrice

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bmyraahi.vendor.R
import com.bmyraahi.vendor.price.Price

class FuturePriceAdapter(var items: ArrayList<Price>) : RecyclerView.Adapter<FuturePriceAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return FuturePriceAdapter.ViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.item_price, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items.get(position))
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(price: Price) {

        }
    }

}
