package com.example.areacalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class CircleFragment : Fragment() {

    private lateinit var circleDiamenter: EditText
    private lateinit var circleAreaText: TextView
    private lateinit var circlePerimeterText: TextView
    private lateinit var circleButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_circle, container, false)
        circleButton = v.findViewById(R.id.btn_circle)
        circleAreaText = v.findViewById(R.id.circle_area_text)
        circleDiamenter = v.findViewById(R.id.circle_input)
        circlePerimeterText = v.findViewById(R.id.circle_perimeter_text)


       circleButton.setOnClickListener {
            var diameter = ((circleDiamenter.text).toString()).toFloat()
            var area = 3.14 * (diameter * diameter)
            var perimeter = 3.14 * 2 * diameter

            circleAreaText.text = "The circle area is: ${String.format("%.2f", area)} cm"
            circlePerimeterText.text = "The circle perimeter is: ${String.format("%.2f", perimeter)} cm"
        }


        return v
    }
}