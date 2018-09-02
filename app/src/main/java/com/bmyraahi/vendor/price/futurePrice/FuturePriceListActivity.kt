package com.bmyraahi.vendor.price.futurePrice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bmyraahi.vendor.R
import com.bmyraahi.vendor.price.Price
import kotlinx.android.synthetic.main.activity_future_price.*

class FuturePriceListActivity : AppCompatActivity() {

    var items: ArrayList<Price> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_future_price)
        rvFuturePrice.adapter = FuturePriceAdapter(items)
    }
}
