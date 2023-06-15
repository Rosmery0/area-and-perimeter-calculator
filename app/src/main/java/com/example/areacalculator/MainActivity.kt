package com.example.areacalculator

import android.app.FragmentTransaction
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.example.areacalculator.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)
        replaceFragment(CircleFragment())

        binding.navMenu.setOnItemReselectedListener { item ->
            when (item.itemId) {
                R.id.circle_item -> { replaceFragment(CircleFragment()) }
                R.id.triangle_item -> { replaceFragment(TriangleFragment()) }
                R.id.square_item -> { replaceFragment(SquareFragment()) }
            }
        }






    }

    private fun replaceFragment(fragment: Fragment) {
        var fragmentManager: FragmentManager = supportFragmentManager
        var fragmentTransaction: androidx.fragment.app.FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_container, fragment)
        fragmentTransaction.commit()
    }



}