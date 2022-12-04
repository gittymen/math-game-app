package com.example.mathgame

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var tvNum1: TextView
    lateinit var tvNum2: TextView
    lateinit var tvAns: TextView
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNum1 = findViewById(R.id.tv_num_1)
        tvNum2 = findViewById(R.id.tv_num_2)
        tvAns = findViewById(R.id.tv_ans)
        tvResult = findViewById(R.id.tv_result)
        run_reset()
    }

    fun run_reset() {
        val myRandom = Random()
        val num1 = myRandom.nextInt(101)
        val num2 = myRandom.nextInt(101)
        tvNum1.text = "" + num1
        tvNum2.text = "" + num2
        tvAns.text = ""
        tvResult.text = ""
    }

    fun printAns(a: String) {
        val text = tvAns.text.toString()
        tvAns.text = text + a
    }

    fun one(view: View?) {
        printAns("1")
    }

    fun two(view: View?) {
        printAns("2")
    }

    fun three(view: View?) {
        printAns("3")
    }

    fun four(view: View?) {
        printAns("4")
    }

    fun five(view: View?) {
        printAns("5")
    }

    fun six(view: View?) {
        printAns("6")
    }

    fun seven(view: View?) {
        printAns("7")
    }

    fun eight(view: View?) {
        printAns("8")
    }

    fun nine(view: View?) {
        printAns("9")
    }

    fun zero(view: View?) {
        printAns("0")
    }

    fun clear(view: View?) {
        run_reset()
    }

    fun submit(view: View?) {
        val num1 = tvNum1.text.toString().toInt()
        val num2 = tvNum2.text.toString().toInt()
        val ans = num1 + num2
        val get_user_ans = tvAns.text.toString().toInt()
        if (ans == get_user_ans) {
            tvResult.text = "CORRECT!!"
        } else {
            tvResult.text = "INCORRECT!!"
        }
    }
}