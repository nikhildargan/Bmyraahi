package com.bmyraahi.vendor.price

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bmyraahi.vendor.R
import kotlinx.android.synthetic.main.activity_price_list.*

class PriceListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_price_list)

        button4.setOnClickListener { startActivity(Intent(this@PriceListActivity, PriceBikeActivity::class.java)) }
        button8.setOnClickListener { startActivity(Intent(this@PriceListActivity, PriceCarActivity::class.java)) }
        button9.setOnClickListener { startActivity(Intent(this@PriceListActivity, PricePerPaxActivity::class.java)) }
        button10.setOnClickListener { startActivity(Intent(this@PriceListActivity, PricePerItemActivity::class.java)) }
        button11.setOnClickListener { startActivity(Intent(this@PriceListActivity, PriceGuideActivity::class.java)) }
        button12.setOnClickListener { startActivity(Intent(this@PriceListActivity, PriceCampingActivity::class.java)) }

    }
}
