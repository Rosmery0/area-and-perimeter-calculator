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
class TriangleFragment : Fragment() {

    private lateinit var triangleSides: EditText
    private lateinit var triangleAreaText: TextView
    private lateinit var trianglePerimeterText: TextView
    private lateinit var triangleButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_triangle, container, false)
        triangleButton = v.findViewById(R.id.btn_triangle)
        triangleAreaText = v.findViewById(R.id.triangle_area_text)
        triangleSides = v.findViewById(R.id.triangle_input)
        trianglePerimeterText = v.findViewById(R.id.triangle_perimeter_text)

        triangleButton.setOnClickListener {
            var sides = ((triangleSides.text).toString()).toFloat()
            var h = (sides * sides) - ((sides / 2) * (sides / 2))
            var area = (sides * h) / 2
            var perimeter = 3 * sides

            triangleAreaText.text = "The circle area is: ${String.format("%.2f", area)} cm"
            trianglePerimeterText.text = "The circle perimeter is: ${String.format("%.2f", perimeter)} cm"
        }

        return v
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TriangleFragment().apply {
            }
    }
}