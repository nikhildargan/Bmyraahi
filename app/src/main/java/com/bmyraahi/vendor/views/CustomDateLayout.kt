package com.bmyraahi.vendor.views

import android.app.DatePickerDialog
import android.content.Context
import android.support.v4.app.FragmentActivity
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.DatePicker
import android.widget.LinearLayout
import android.widget.TextView
import com.bmyraahi.vendor.R
import kotlinx.android.synthetic.main.layout_custom_date.view.*


class CustomDateLayout @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0
) : LinearLayout(context, attrs, defStyle), DatePickerDialog.OnDateSetListener {


    var title: TextView
    var date: TextView

    init {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.layout_custom_date, this, true)

        orientation = VERTICAL

        attrs?.let {

        }

        title = view.tvTitle
        date = view.tvDate
        view.ivCalendar.setOnClickListener {
            getDate()

        }

    }

    fun getDate() {
        val newFragment = DatePickerFragment()
        val fragmentActivity = getContext() as FragmentActivity
        val fm = fragmentActivity.supportFragmentManager
        newFragment.show(fm, "date picker")
    }

    override fun onDateSet(p0: DatePicker?, year: Int, month: Int, day: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}