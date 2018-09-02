package com.bmyraahi.vendor.views

import android.support.v4.app.DialogFragment
import android.widget.Toast
import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.DatePicker
import java.util.*


class DatePickerFragment : DialogFragment(),DatePickerDialog.OnDateSetListener{
    override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {

    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        return DatePickerDialog(activity, this, year, month, day)
    }


}