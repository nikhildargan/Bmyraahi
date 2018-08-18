package com.bmyraahi.vendor.bookings

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bmyraahi.vendor.R
import kotlinx.android.synthetic.main.activity_booking.*

class BookingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        val bookingTabAdapter = BookingTabAdapter(supportFragmentManager)
        viewpagerBookings.adapter= bookingTabAdapter
        tabLayout.setupWithViewPager(viewpagerBookings)
    }
}
