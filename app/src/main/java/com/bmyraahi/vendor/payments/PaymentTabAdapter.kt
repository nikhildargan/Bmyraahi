package com.bmyraahi.vendor.payments

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


class PaymentTabAdapter (fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
        var mNumOfTabs: Int = 2

        override fun getItem(position: Int): Fragment? {
            when (position) {
                0 -> {
                    return PaymentMadeFragment()
                }
                1 -> {
                    return PaymentPendingFragment()
                }
                else -> return null
            }
        }

        override fun getCount(): Int {
            return mNumOfTabs
        }

        override fun getPageTitle(position: Int): CharSequence {
            return when (position) {
                0 -> "PAYMENTS MADE"
                1 -> "PAYMENTS PENDING"

                else -> ({
                }).toString()
            }
        }
    }

