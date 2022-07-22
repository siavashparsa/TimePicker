package com.example.timepicker

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), DateDialog.DateDialogListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            val dateDialog = DateDialog(this@MainActivity)
            dateDialog.setDateDialogListener(this@MainActivity)
            dateDialog.show()
        }


    }

    override fun OnDateValidate(time: String?) {
        Toast.makeText(this, time, Toast.LENGTH_SHORT).show()
    }
}