package com.bjw.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        val result = findViewById<TextView>(R.id.result)



        val txtNum1 = intent.getStringExtra("edit1")
        val txtNum2 = intent.getStringExtra("edit2")

        val intNum1 = Integer.parseInt(txtNum1)
        val intNum2 = Integer.parseInt(txtNum2)

        val sum = (intNum1 + intNum2).toString()
        val subtract = (intNum1 - intNum2).toString()
        val multiplication = (intNum1 * intNum2).toString()
        val division = (intNum1 / intNum2).toString()

        result.text = "더하기 : " + sum+
                "\n빼기 : " + subtract +
                "\n곱하기 : " + multiplication+
                "\n나누기 : " + division

    }
}