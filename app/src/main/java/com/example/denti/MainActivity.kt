package com.example.denti

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(
            application, "Test",
            Analytics::class.java, Crashes::class.java
        )

        var btn_click_me = findViewById(R.id.btn_click_me) as Button

        btn_click_me.setOnClickListener{
            Toast.makeText(this, "Hi there! This is a Toast", Toast.LENGTH_LONG).show()
        }
    }
}