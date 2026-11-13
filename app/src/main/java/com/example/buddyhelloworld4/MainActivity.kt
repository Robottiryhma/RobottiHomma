package com.example.buddyhelloworld4

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.content.Intent

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val buttonSpeak = findViewById<Button>(R.id.buttonSpeak)
        val buttonMap = findViewById<Button>(R.id.buttonMap)
        val buttonLanguages = findViewById<Button>(R.id.buttonLanguages)

        buttonSpeak.setOnClickListener {
            Toast.makeText(this, "Speak selected", Toast.LENGTH_SHORT).show()
        }

        buttonMap.setOnClickListener {
            startActivity(Intent(this, MapActivity::class.java))
        }

        buttonLanguages.setOnClickListener {
            startActivity(
                Intent(this, LanguageActivity::class.java)
            )
        }
    }
}
