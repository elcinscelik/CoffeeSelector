package com.elcinseraycelik.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button = findViewById<RadioButton>(R.id.radio1)
        val button2 = findViewById<RadioButton>(R.id.radio2)
        val button3 = findViewById<RadioButton>(R.id.radio3)
        val btnPay = findViewById<Button>(R.id.btn1)
        val btnReset = findViewById<Button>(R.id.btn2)
        val btnExit = findViewById<Button>(R.id.btn3)
        val radioG = findViewById<RadioGroup>(R.id.group)
        val check = findViewById<CheckBox>(R.id.cream)
        val check2 = findViewById<CheckBox>(R.id.sugar)
        var result2 = ""




        btnPay.setOnClickListener(View.OnClickListener {
            result2 = radio()
            if(check.isChecked && check2.isChecked){
                result2 +=  "with cream and sugar"
            }
            else   if(check2.isChecked){
                result2 +=  "with sugar"
            }
            else if (check.isChecked){
                result2 +=  "cream"
            }
            else {
                result2 += "with no selection "

            }
            Toast.makeText(applicationContext,result2,Toast.LENGTH_SHORT).show()



        })
        btnReset.setOnClickListener(View.OnClickListener {
            check.isChecked=false
            check2.isChecked=false
            radioG.clearCheck()
            result2 = ""


        })

        btnExit.setOnClickListener(View.OnClickListener { exitProcess(1) })
    }
    fun radio ():String {
        val button = findViewById<RadioButton>(R.id.radio1)
        val button2 = findViewById<RadioButton>(R.id.radio2)
        val button3 = findViewById<RadioButton>(R.id.radio3)
        var result = ""

        if(button.isChecked) {
            result += button.text.toString()
        }
        else if (button2.isChecked){
            result += button2.text.toString()
        }
        else if (button3.isChecked){
            result += button3.text.toString()
        }
        else {
            result = "Please Select Your Coffee"
        }
    return result
    }



}