package com.example.zuriincreamentdecreamenttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
   var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var answer = findViewById<TextView>(R.id.output)
        var incr = findViewById<Button>(R.id.increase)
        var decr = findViewById<Button>(R.id.decrease)

        incr.setOnClickListener{
            count++
                answer.setText("$count")
            }

        decr.setOnClickListener {
                count--
                answer.setText("$count")
            }
    }
}