package com.bmyraahi.vendor.price

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bmyraahi.vendor.R
import kotlinx.android.synthetic.main.activity_price_per_item.*

class PricePerItemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_price_per_item)
//todo add attributes for this
        cplPrice.hideEditBox()
    }
}
