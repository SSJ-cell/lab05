package com.example.lab05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editNum1 = findViewById<EditText>(R.id.editNum1)
        val editNum2 = findViewById<EditText>(R.id.editNum2)
        val textResult = findViewById<TextView>(R.id.textResult)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSub = findViewById<Button>(R.id.btnSub)
        val btnMul = findViewById<Button>(R.id.btnMul)
        val btnDiv = findViewById<Button>(R.id.btnDiv)

        // 더하기
        btnAdd.setOnClickListener {
            val n1 = editNum1.text.toString().toDoubleOrNull() ?: 0.0
            val n2 = editNum2.text.toString().toDoubleOrNull() ?: 0.0
            textResult.text = "결과: ${n1 + n2}"
        }

        // 빼기
        btnSub.setOnClickListener {
            val n1 = editNum1.text.toString().toDoubleOrNull() ?: 0.0
            val n2 = editNum2.text.toString().toDoubleOrNull() ?: 0.0
            textResult.text = "결과: ${n1 - n2}"
        }

        // 곱하기
        btnMul.setOnClickListener {
            val n1 = editNum1.text.toString().toDoubleOrNull() ?: 0.0
            val n2 = editNum2.text.toString().toDoubleOrNull() ?: 0.0
            textResult.text = "결과: ${n1 * n2}"
        }

        // 나누기
        btnDiv.setOnClickListener {
            val n1 = editNum1.text.toString().toDoubleOrNull() ?: 0.0
            val n2 = editNum2.text.toString().toDoubleOrNull() ?: 0.0
            if (n2 == 0.0) {
                textResult.text = "결과: 0으로 나눌 수 없습니다."
            } else {
                textResult.text = "결과: ${n1 / n2}"
            }
        }
    }
}