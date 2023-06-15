package com.example.areacalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SquareFragment : Fragment() {

    private lateinit var squareSides: EditText
    private lateinit var squareAreaText: TextView
    private lateinit var squarePerimeterText: TextView
    private lateinit var squareButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_square, container, false)
        squareButton = v.findViewById(R.id.btn_square)
        squareAreaText = v.findViewById(R.id.square_area_text)
        squareSides = v.findViewById(R.id.square_input)
        squarePerimeterText = v.findViewById(R.id.square_perimeter_text)


        squareButton.setOnClickListener {
            var sides = ((squareSides.text).toString()).toFloat()
            var area = sides * sides
            var perimeter = 4 * sides

            squareAreaText.text = "The circle area is: ${String.format("%.2f", area)} cm"
            squarePerimeterText.text = "The circle perimeter is: ${String.format("%.2f", perimeter)} cm"
        }

        return v
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SquareFragment().apply {

            }
    }
}