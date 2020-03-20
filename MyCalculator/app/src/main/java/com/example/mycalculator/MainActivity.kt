package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun performAddition(view: View){
        val firstNumber = txtFirstValue.text.toString().toInt()
        val secondNumber = txtSecondValue.text.toString().toInt()
        val additionOp = firstNumber + secondNumber
//        val txtResult: Int = firstNumber + secondNumber
//        set

//        txtTest1.text  = txtResult.toString()
//        txtResult.text = getString(R.string.name)
        txtResult.text = additionOp.toString()
        Log.d("Tag","reseul $additionOp")
        print("onclick")
        print("val 1: $firstNumber")
        print("val 2: $secondNumber")
    }


}
