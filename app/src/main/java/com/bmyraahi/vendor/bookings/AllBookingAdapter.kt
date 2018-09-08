package com.bmyraahi.vendor.bookings

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bmyraahi.vendor.R
import kotlinx.android.synthetic.main.item_booking.view.*

class AllBookingAdapter(var items: ArrayList<BookingItem>) : RecyclerView.Adapter<AllBookingAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return AllBookingAdapter.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_booking, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items.get(position))
    }


    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(bookingItem: BookingItem) {

            itemView.button5.visibility = View.GONE
            itemView.button3.visibility = View.GONE


        }
    }

}
