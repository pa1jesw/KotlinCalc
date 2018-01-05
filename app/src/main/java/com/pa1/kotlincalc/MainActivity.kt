package com.pa1.kotlincalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnAdd.setOnClickListener{
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()
            var result = number1?.toLong() + number2?.toLong()
            Toast.makeText(this,"Result of "+number1 +"+"+number2+" is"+result,Toast.LENGTH_LONG).show()
        }
        btnSubtract.setOnClickListener{
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()
            var result = number1?.toLong() - number2?.toLong()
            Toast.makeText(this,"Result of "+number1 +"-"+number2+" is"+result,Toast.LENGTH_LONG).show()
        }
        btnDivide.setOnClickListener{
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()
            var result = number1?.toDouble()/ number2?.toDouble()
            Toast.makeText(this,"Result of "+number1 +"/"+number2+" is"+result,Toast.LENGTH_LONG).show()
        }
        btnMultiply.setOnClickListener{
            var number1 = etNumber1.text.toString()
            var number2 = etNumber2.text.toString()
            var result = number1?.toLong() * number2?.toLong()
            Toast.makeText(this,"Result of "+number1 +"*"+number2+" is"+result,Toast.LENGTH_LONG).show()
        }
    }
}
