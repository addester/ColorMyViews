package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {


        val clickableViews: List<View> =
            listOf(findViewById(R.id.box_one_text),findViewById(R.id.box_two_text),findViewById(R.id.box_three_text),
                findViewById(R.id.box_four_text),findViewById(R.id.box_five_text),findViewById(R.id.constraint_layout),
                findViewById(R.id.red_button),findViewById(R.id.yellow_button),findViewById(R.id.green_button))

        for(item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        val b3 :View= findViewById(R.id.box_three_text)
        val b4 :View= findViewById(R.id.box_four_text)
        val b5 :View= findViewById(R.id.box_five_text)

        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> b3.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> b4.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> b5.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}