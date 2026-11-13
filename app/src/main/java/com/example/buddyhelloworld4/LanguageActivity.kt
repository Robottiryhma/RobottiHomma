
package com.example.buddyhelloworld4

import android.app.Activity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class LanguageActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_language)

        val buttonEnglish = findViewById<Button>(R.id.buttonEnglish)
        val buttonFinnish = findViewById<Button>(R.id.buttonFinnish)
        val buttonBack = findViewById<Button>(R.id.buttonBack)

        buttonEnglish.setOnClickListener {
            saveLanguage("en")
        }

        buttonFinnish.setOnClickListener {
            saveLanguage("fi")
        }

        buttonBack.setOnClickListener {
            finish()
        }
    }

    private fun saveLanguage(language: String) {

        getSharedPreferences("settings", MODE_PRIVATE)
            .edit()
            .putString("language", language)
            .apply()

        finish()
    }
}
