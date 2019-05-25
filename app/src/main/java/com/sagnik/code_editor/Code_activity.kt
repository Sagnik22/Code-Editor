package com.sagnik.code_editor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Code_activity : AppCompatActivity() {

    lateinit var web_browser:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_activity)


        web_browser = findViewById(R.id.web_browser)

        web_browser.loadData(intent.getStringExtra("code"),"text/html",null)

    }
}

