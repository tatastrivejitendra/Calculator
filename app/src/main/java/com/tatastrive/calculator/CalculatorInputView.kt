package com.tatastrive.calculator

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.view_calculator_input.view.*

class CalculatorInputView(context: Context, attrs: AttributeSet?) : RelativeLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.view_calculator_input, this, true)
        attrs?.run {
            val typeArray = context.obtainStyledAttributes(attrs, R.styleable.CalculatorInputView)

            val textResources = typeArray.getString(R.styleable.CalculatorInputView_Item_text)
            val iconResources =
                typeArray.getResourceId(R.styleable.CalculatorInputView_Item_icon, -1)

            when{
                iconResources != -1 ->{
                    input_element_text.visibility = View.GONE
                    input_element_image.apply {
                        visibility = View.VISIBLE
                        setImageResource(iconResources)
                    }
                } !textResources.isNullOrEmpty() ->{
                    input_element_image.visibility = View.GONE
                    input_element_text.apply {
                        visibility = View.VISIBLE
                        text = textResources
                    }
                }
                else ->{
                    input_element_image.visibility = View.GONE
                    input_element_text.visibility = View.GONE
                }
            }
            typeArray.recycle()
        }
    }

    override fun setOnClickListener(l: OnClickListener?) {
        input_element_click.setOnClickListener(l)
    }
}
