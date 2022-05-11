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

    private fun setListeners(){
          var  boxonetext:View = findViewById(R.id.box_one_text)
        var  boxtwotext:View = findViewById(R.id.box_two_text)
        var  boxthreetext:View = findViewById(R.id.box_three_text)
        var  boxfourtext:View = findViewById(R.id.box_four_text)
        var  boxfivetext:View = findViewById(R.id.box_five_text)
        val clickableViews: List<View> =
            listOf(boxonetext, boxtwotext, boxthreetext, boxfourtext, boxfivetext)

        for (item in clickableViews) {
            item.setOnClickListener{makeColored(it)}
        }
    }

    fun makeColored(view: View) {
        when (view.id) {

            // usando la clase color para colorear el fondo
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // usando los recursos de android para el fondo
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}