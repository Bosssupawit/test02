package com.example.test02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.content.Intent
import com.example.test02.CalculatorV2Activity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quizButton = findViewById<Button>(R.id.Quizapp)
        val calculatorButton = findViewById<Button>(R.id.Calculatorv2)
        val loginButton = findViewById<Button>(R.id.Login)

        quizButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Opening Quiz app", Toast.LENGTH_SHORT).show()

        }

        calculatorButton.setOnClickListener {
            // เมื่อคลิกปุ่ม Calculator v2
            Toast.makeText(this@MainActivity, "Opening Calculator v2", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity, CalculatorV2Activity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Opening Login", Toast.LENGTH_SHORT).show()

        }
    }
}
