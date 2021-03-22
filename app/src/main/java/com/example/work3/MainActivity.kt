package com.example.work3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setOnClickListener {
            if (textView.text.toString()=="0"){
                textView.setText("1")
            }else{  var strone =textView.text.toString().plus(1)
                textView.setText(strone)
            }
        }

        two.setOnClickListener {
            if (textView.text.toString()=="0") {
                textView.setText("2")
            }else{var strtwo =textView.text.toString().plus(2)
                textView.setText(strtwo)
            }
        }

        three.setOnClickListener {
            if (textView.text.toString()=="0"){
                textView.setText("3")
        }else{ var strthree =textView.text.toString().plus(3)
                textView.setText(strthree)
            }
        }

        four.setOnClickListener {
            if (textView.text.toString()=="0"){
                textView.setText("4")
        }else{var strfour =textView.text.toString().plus(4)
                textView.setText(strfour)
            }
        }

        five.setOnClickListener {
            if (textView.text.toString()=="0") {
                textView.setText("5")
            }else{var strfive =textView.text.toString().plus(5)
                textView.setText(strfive)
            }
        }

        six.setOnClickListener {
            if (textView.text.toString()=="0") {
                textView.setText("6")
            }else{ var strsix =textView.text.toString().plus(6)
                textView.setText(strsix)
            }
        }

        seven.setOnClickListener {
            if (textView.text.toString()=="0") {
                textView.setText("7")
            }else{  var strseven =textView.text.toString().plus(7)
                textView.setText(strseven)
            }
        }

        eight.setOnClickListener {
            if (textView.text.toString()=="0") {
                textView.setText("8")
            }else{var streight =textView.text.toString().plus(8)
                textView.setText(streight)
            }
        }

        nine.setOnClickListener {
            if (textView.text.toString()=="0") {
                textView.setText("9")
            }else{ var strnine =textView.text.toString().plus(9)
                textView.setText(strnine)
            }
        }

        zero.setOnClickListener {
            if (textView.text.toString()=="0") {
                textView.setText("0")
            }else{ var strzero =textView.text.toString().plus(0)
                textView.setText(strzero)
            }
        }
        cancel.setOnClickListener {
            textView.setText("0")
        }

        del.setOnClickListener {
            if (textView.text.toString().length<=1) {
                textView.setText("0")
            }else if (textView.text.isNotEmpty()){
                textView.text=textView.text.dropLast(1)
            }
        }
    }
}