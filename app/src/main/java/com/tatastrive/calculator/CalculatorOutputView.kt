package com.tatastrive.calculator

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout

class CalculatorOutputView(context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs){

    init {
        //set orientation
        orientation = VERTICAL
        //set gravity
        gravity = Gravity.CENTER_VERTICAL
        //inflate layout
      LayoutInflater.from(context).inflate(R.layout.view_calculator_output,this,true)

    }


}