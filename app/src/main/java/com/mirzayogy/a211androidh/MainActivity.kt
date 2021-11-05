package com.mirzayogy.a211androidh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)
        val namaEditText = findViewById<EditText>(R.id.namaEditText)

        simpanButton.setOnClickListener {
            namaEditText.setText("")
        }

        batalButton.setOnClickListener {
            finish()
        }
    }
}