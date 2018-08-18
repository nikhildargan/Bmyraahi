package com.bmyraahi.vendor.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bmyraahi.vendor.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvHome.adapter = HomeAdapter(buildItems())
    }

    private fun buildItems(): ArrayList<HomeAdapter.HomeItem> {
        var items :ArrayList<HomeAdapter.HomeItem> = ArrayList()

        items.add(HomeAdapter.HomeItem(R.drawable.booking_icon,"Bookings"))
        items.add(HomeAdapter.HomeItem(R.drawable.rates_icon,"Rates"))
        items.add(HomeAdapter.HomeItem(R.drawable.future_date_icon ,"Future Rates"))
        items.add(HomeAdapter.HomeItem(R.drawable.inventory ,"Inventory"))
        items.add(HomeAdapter.HomeItem(R.drawable.block_inventory ,"Block Inventory"))
        items.add(HomeAdapter.HomeItem(R.drawable.blocked_inventory ,"Blocked Inventory"))
        items.add(HomeAdapter.HomeItem(R.drawable.payments_icon ,"Payments"))
        items.add(HomeAdapter.HomeItem(R.drawable.review_icon ,"Reviews"))
        items.add(HomeAdapter.HomeItem(R.drawable.refer_icon ,"Refer & Earn"))
        items.add(HomeAdapter.HomeItem(R.drawable.accounts_icon ,"Accounts"))

        return items
    }
}
