package com.bmyraahi.vendor

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.TextView
import kotlinx.android.synthetic.main.layout_custom_time_spinners.view.*


class CustomTimeSpinnersLayout @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0
) : LinearLayout(context, attrs, defStyle) {

      var title : TextView
     var spHours: Spinner
     var spMinutes: Spinner
     var spNight: Spinner

    init {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.layout_custom_time_spinners, this, true)

        orientation = VERTICAL

        attrs?.let{

        }

        title = view.tvTitle
        spHours = view.spHours
        spMinutes = view.spMinutes
        spNight = view.spNight
    }



}