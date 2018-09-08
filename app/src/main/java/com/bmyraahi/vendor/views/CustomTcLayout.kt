package com.bmyraahi.vendor.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.bmyraahi.vendor.R
import kotlinx.android.synthetic.main.layout_tc.view.*


class CustomTcLayout @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0
) : LinearLayout(context, attrs, defStyle) {



    init {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.layout_custom_tc, this, true)

        orientation = VERTICAL

        attrs?.let{


        }

        view.ivAddTc.setOnClickListener {  }

    }



}