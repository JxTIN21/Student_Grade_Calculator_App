package com.example.studentgradecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


lateinit var txtResult: TextView
lateinit var txtTotal: TextView
lateinit var txtPercentage: TextView
lateinit var txtGrade: TextView
lateinit var btnBack: Button

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        title = "Result"

        txtResult = findViewById(R.id.txtResult)
        txtTotal = findViewById(R.id.txtTotal)
        txtPercentage = findViewById(R.id.txtPercentage)
        txtGrade = findViewById(R.id.txtGrade)
        btnBack = findViewById(R.id.btnBack)

        val totalMarks = intent.getDoubleExtra("totalMarks", 0.0)
        val average = intent.getDoubleExtra("average", 0.0)
        val grade = intent.getStringExtra("grade")

        txtTotal.text = "Total Marks: $totalMarks"
        txtPercentage.text = "Average Percentage: $average"
        txtGrade.text = "Grade: $grade"

        btnBack.setOnClickListener {
            val intent = Intent(this@result, MainActivity::class.java)
            startActivity(intent)
        }

    }
}