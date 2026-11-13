package com.example.buddyhelloworld4

import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

class MapActivity : Activity() {

    private lateinit var mapWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        mapWebView = findViewById(R.id.mapWebView)
        val buttonBack = findViewById<Button>(R.id.buttonBack)

        mapWebView.settings.javaScriptEnabled = true
        mapWebView.settings.domStorageEnabled = true

        mapWebView.webViewClient = WebViewClient()
        mapWebView.webChromeClient = WebChromeClient()

        mapWebView.loadUrl("https://link.mazemap.com/tDco0OMP")

        buttonBack.setOnClickListener {
            finish()
        }
    }

    @Deprecated("Deprecated in Android")
    override fun onBackPressed() {
        if (mapWebView.canGoBack()) {
            mapWebView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
