package com.example.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        showTimePickerDialog()
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                var timeMinutes = 60 * hour + minute;
                var greeting = ""
                if (timeMinutes >= 120 && timeMinutes < 600) greeting = "おはよう"
                else if (timeMinutes >= 600 && timeMinutes < 1080) greeting = "こんにちは"
                else greeting = "こんばんは"
                textView.text = greeting
            },
            13, 0, true)
        timePickerDialog.show()
    }
}
