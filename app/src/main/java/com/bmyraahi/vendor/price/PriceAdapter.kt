package com.bmyraahi.vendor.price

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bmyraahi.vendor.R

class PriceAdapter(var items: ArrayList<Price>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)

        return when (viewType) {
            RowType.PRICE.ordinal -> PriceViewHolder(layoutInflater.inflate(R.layout.item_price, parent, false))
            else -> NoPriceViewHolder(layoutInflater.inflate(R.layout.item_no_price, parent, false))
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val price = items.get(position)

        price.price?.let {
            val priceHolder = holder as PriceViewHolder
            priceHolder.bind(price)
        } ?: run {
            val noPriceHolder = holder as NoPriceViewHolder
            noPriceHolder.bind(price)
        }
    }

    class PriceViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(price: Price) {

        }
    }

    class NoPriceViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(price: Price) {

        }
    }

}
