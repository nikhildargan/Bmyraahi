package com.bmyraahi.vendor.payments

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bmyraahi.vendor.R
import kotlinx.android.synthetic.main.activity_payment.*

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        val paymentTabAdapter = PaymentTabAdapter(supportFragmentManager)
        viewpagerPayment.adapter = paymentTabAdapter
        tabLayout.setupWithViewPager(viewpagerPayment)
    }
}
