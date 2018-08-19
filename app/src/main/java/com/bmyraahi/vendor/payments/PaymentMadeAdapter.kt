package com.bmyraahi.vendor.payments

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bmyraahi.vendor.R
import com.bmyraahi.vendor.home.HomeAdapter

class PaymentMadeAdapter(var items: ArrayList<PaymentItem>) : RecyclerView.Adapter<PaymentMadeAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return PaymentMadeAdapter.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_payment, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items.get(position))
    }


    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(bookingItem: PaymentItem) {

        }
    }

}
