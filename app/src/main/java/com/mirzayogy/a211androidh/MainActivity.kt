package com.mirzayogy.a211androidh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val noHandphoneEditText = findViewById<EditText>(R.id.noHandphoneEditText)
        val jarakEditText = findViewById<EditText>(R.id.jarakEditText)
        val tanggalLahirEditText = findViewById<EditText>(R.id.tanggalLahirEditText)

        simpanButton.setOnClickListener {
            val nama = namaEditText.text.toString()
            var jarak = jarakEditText.text.toString().toInt()
            jarak = jarak * 1000

            Toast.makeText(this,"Hai $jarak",Toast.LENGTH_SHORT).show()
        }

        batalButton.setOnClickListener {
            finish()
        }
    }
}