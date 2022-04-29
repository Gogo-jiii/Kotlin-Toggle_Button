package com.example.togglebutton

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton.setOnCheckedChangeListener { compoundButton, isChecked ->
            Toast.makeText(
                this@MainActivity,
                "is ON? $isChecked",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}