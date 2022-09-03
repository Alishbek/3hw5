package com.example.a3hw5

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvNumber: TextView
    private lateinit var btnPlusMinus: Button

    private val plus: String = "+"
    private val minus: String = "-"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNumber = findViewById(R.id.tv_number)
        btnPlusMinus = findViewById(R.id.btn_plus_minus)
        btnPlusMinus.text = plus

        btnPlusMinus.setOnClickListener {
            when(btnPlusMinus.text){
                plus -> when(tvNumber.text) {
                    "0" -> tvNumber.text = "1"
                    "1" -> tvNumber.text = "2"
                    "2" -> tvNumber.text = "3"
                    "3" -> tvNumber.text = "4"
                    "4" -> tvNumber.text = "5"
                    "5" -> tvNumber.text = "6"
                    "6" -> tvNumber.text = "7"
                    "7" -> tvNumber.text = "8"
                    "8" -> tvNumber.text = "9"
                    "9" -> tvNumber.text = "10"

                }
                minus -> when(tvNumber.text){
                    "10" -> tvNumber.text = "9"
                    "9" -> tvNumber.text = "8"
                    "8" -> tvNumber.text = "7"
                    "7" -> tvNumber.text = "6"
                    "6" -> tvNumber.text = "5"
                    "5" -> tvNumber.text = "4"
                    "4" -> tvNumber.text = "3"
                    "3" -> tvNumber.text = "2"
                    "2" -> tvNumber.text = "1"
                    "1" -> tvNumber.text = "0"
                }



            }
            if (tvNumber.text == "10") btnPlusMinus.text = minus
            if (tvNumber.text == "0") btnPlusMinus.text = plus
        }


    }


}

