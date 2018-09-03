package com.bmyraahi.vendor.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import com.bmyraahi.vendor.R
import kotlinx.android.synthetic.main.layout_custom_edit.view.*


class CustomDoubleEditBoxLayout @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0
) : LinearLayout(context, attrs, defStyle) {

      var title : TextView
     var etField: EditText

    init {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.layout_custom_double_edit, this, true)

        orientation = VERTICAL

        attrs?.let{

        }

        title = view.tvTitle
        etField = view.etField
    }



}