package com.bmyraahi.vendor.payments

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.bmyraahi.vendor.R

import kotlinx.android.synthetic.main.activity_payment_details.*

class PaymentDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_details)
        setSupportActionBar(toolbar)


    }

}
