package com.facebook.workmanager_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startButton = findViewById<Button>(R.id.start_button)
        startButton.setOnClickListener {
            val workRequest = OneTimeWorkRequest.Builder(MyWorker::class.java)
                .build()

            WorkManager.getInstance(applicationContext).enqueue(workRequest)
        }
    }
}