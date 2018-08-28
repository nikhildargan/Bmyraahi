package com.bmyraahi.vendor.home

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import com.bmyraahi.vendor.OnItemClickListener
import com.bmyraahi.vendor.R
import com.bmyraahi.vendor.account.ProfileActivity
import com.bmyraahi.vendor.blockInventory.BlockedActivity
import com.bmyraahi.vendor.bookings.BookingActivity
import com.bmyraahi.vendor.inventory.AddInventoryActivity
import com.bmyraahi.vendor.payments.PaymentActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvHome.adapter = HomeAdapter(buildItems())

        rvHome.addOnItemClickListener(object : OnItemClickListener {
            override fun onItemClicked(position: Int, view: View) {
                var launcherIntent: Intent
                when (position) {
                    0 -> launcherIntent = Intent(this@HomeActivity, BookingActivity::class.java)
                    1 -> launcherIntent = Intent(this@HomeActivity, BookingActivity::class.java)
                    2 -> launcherIntent = Intent(this@HomeActivity, BookingActivity::class.java)
                    3 -> launcherIntent = Intent(this@HomeActivity, AddInventoryActivity::class.java)
                    4 -> launcherIntent = Intent(this@HomeActivity, BookingActivity::class.java)
                    5 -> launcherIntent = Intent(this@HomeActivity, BlockedActivity::class.java)
                    6 -> launcherIntent = Intent(this@HomeActivity, PaymentActivity::class.java)
                    7 -> launcherIntent = Intent(this@HomeActivity, PaymentActivity::class.java)
                    8 -> launcherIntent = Intent(this@HomeActivity, PaymentActivity::class.java)
                    9 -> launcherIntent = Intent(this@HomeActivity, ProfileActivity::class.java)
                    else -> {
                        launcherIntent = Intent(this@HomeActivity, BookingActivity::class.java)
                    }
                }
                startActivity(launcherIntent)

            }
        })
    }

    private fun buildItems(): ArrayList<HomeAdapter.HomeItem> {
        var items: ArrayList<HomeAdapter.HomeItem> = ArrayList()

        items.add(HomeAdapter.HomeItem(R.drawable.booking_icon, "Bookings"))
        items.add(HomeAdapter.HomeItem(R.drawable.rates_icon, "Rates"))
        items.add(HomeAdapter.HomeItem(R.drawable.future_date_icon, "Future Rates"))
        items.add(HomeAdapter.HomeItem(R.drawable.inventory, "Inventory"))
        items.add(HomeAdapter.HomeItem(R.drawable.block_inventory, "Block Inventory"))
        items.add(HomeAdapter.HomeItem(R.drawable.blocked_inventory, "Blocked Inventory"))
        items.add(HomeAdapter.HomeItem(R.drawable.payments_icon, "Payments"))
        items.add(HomeAdapter.HomeItem(R.drawable.review_icon, "Reviews"))
        items.add(HomeAdapter.HomeItem(R.drawable.refer_icon, "Refer & Earn"))
        items.add(HomeAdapter.HomeItem(R.drawable.accounts_icon, "Accounts"))

        return items
    }
}

fun RecyclerView.addOnItemClickListener(onClickListener: OnItemClickListener) {
    this.addOnChildAttachStateChangeListener(object : RecyclerView.OnChildAttachStateChangeListener {
        override fun onChildViewDetachedFromWindow(view: View?) {
            view?.setOnClickListener(null)
        }

        override fun onChildViewAttachedToWindow(view: View?) {
            view?.setOnClickListener({
                val holder = getChildViewHolder(view)
                onClickListener.onItemClicked(holder.adapterPosition, view)
            })
        }
    })
}

