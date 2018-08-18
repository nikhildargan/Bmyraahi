package com.bmyraahi.vendor.bookings

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


class BookingTabAdapter (fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
        var mNumOfTabs: Int = 2

        override fun getItem(position: Int): Fragment? {
            when (position) {
                0 -> {
                    return NewBookingFragment()
                }
                1 -> {
                    return AllBookingFragment()
                }
                else -> return null
            }
        }

        override fun getCount(): Int {
            return mNumOfTabs
        }

        override fun getPageTitle(position: Int): CharSequence {
            return when (position) {
                0 -> "New Bookings"
                1 -> "All Bookings"

                else -> ({
                }).toString()
            }
        }
    }

