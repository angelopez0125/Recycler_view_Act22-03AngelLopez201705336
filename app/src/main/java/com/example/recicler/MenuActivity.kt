package com.example.recicler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSalir = findViewById<Button>(R.id.ejemplo_btn_salir)
        val btnPersona = findViewById<Button>(R.id.ejemplo_btn_personas)
        val btnVehiculo = findViewById<Button>(R.id.ejemplo_btn_vehiculos)
        val btnProductos = findViewById<Button>(R.id.ejemplo_btn_productos)

        btnSalir.setOnClickListener {
            finishAndRemoveTask()
        }
        btnPersona.setOnClickListener {
            val llamarPersonas: Intent = Intent(this, MainActivity::class.java)
            startActivity(llamarPersonas)
        }
        btnVehiculo.setOnClickListener {
            val llamarVehiculos: Intent = Intent(this, MainActivity::class.java)
            startActivity(llamarVehiculos)
        }
        btnProductos.setOnClickListener {
            val llamarProductos: Intent = Intent(this, MainActivity::class.java)
            startActivity(llamarProductos)
        }
    }

}