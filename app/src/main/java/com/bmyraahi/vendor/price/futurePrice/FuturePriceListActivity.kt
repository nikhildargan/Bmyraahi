package com.bmyraahi.vendor.price.futurePrice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bmyraahi.vendor.R
import com.bmyraahi.vendor.price.Price
import com.bmyraahi.vendor.price.RowType
import kotlinx.android.synthetic.main.activity_future_price.*

class FuturePriceListActivity : AppCompatActivity() {

    var items: ArrayList<Price> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_future_price)
        items.add(Price(RowType.PRICE,800))
        items.add(Price(RowType.NO_PRICE,800))
        rvFuturePrice.adapter = FuturePriceAdapter(items)

        btnFuturePrice.setOnClickListener {
            startActivity(Intent(this@FuturePriceListActivity, UpdateActivity::class.java))
        }
    }
}
