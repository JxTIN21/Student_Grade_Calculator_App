package com.example.studentgradecalculator

import android.content.Intent
import android.icu.text.CaseMap.Title
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var txtName: TextView
lateinit var etSubject1: EditText
lateinit var etSubject2: EditText
lateinit var etSubject3: EditText
lateinit var etSubject4: EditText
lateinit var etSubject5: EditText
lateinit var btn: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Enter Marks"

        txtName = findViewById(R.id.txtName)
        etSubject1 = findViewById(R.id.etSubject1)
        etSubject2 = findViewById(R.id.etSubject2)
        etSubject3 = findViewById(R.id.etSubject3)
        etSubject4 = findViewById(R.id.etSubject4)
        etSubject5 = findViewById(R.id.etSubject5)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener {

            val subject1Marks = findViewById<EditText>(R.id.etSubject1).text.toString().toDouble()
            val subject2Marks = findViewById<EditText>(R.id.etSubject2).text.toString().toDouble()
            val subject3Marks = findViewById<EditText>(R.id.etSubject3).text.toString().toDouble()
            val subject4Marks = findViewById<EditText>(R.id.etSubject4).text.toString().toDouble()
            val subject5Marks = findViewById<EditText>(R.id.etSubject5).text.toString().toDouble()

            val totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks
            val average = totalMarks/5
            val grade = calculateGrade(average)

            val intent = Intent(this@MainActivity, result::class.java)
            intent.putExtra("totalMarks", totalMarks)
            intent.putExtra("average", average)
            intent.putExtra("grade", grade)
            startActivity(intent)
        }
    }
    private fun calculateGrade(average: Double): String {
        return when {
            average >= 90.0 -> "A"
            average >= 80 -> "B"
            average >= 70 -> "C"
            average >= 60 -> "D"
            else -> "F"
        }
    }

}
