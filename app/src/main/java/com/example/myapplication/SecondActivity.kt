package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    var boton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        boton = findViewById(R.id.segunda_boton_label)
        boton?.setOnClickListener{
            Toast.makeText(this, "Hola Soy David!", Toast.LENGTH_LONG).show()
        }
    }
}