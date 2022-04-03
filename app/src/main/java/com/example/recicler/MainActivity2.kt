package com.example.recicler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplorecyclerview22mar22.Adaptador

class MainActivity2 : AppCompatActivity() {

    var vehiculos= listOf<Vehiculos>(
        Vehiculos(placa = "M 1233", nombrepropietario = "José", marca = "Hyundai", modelo = "2022", color = "Rojo", imagen = "https://s7d1.scene7.com/is/image/hyundai/2021-accent-hc-0038:16-9?wid=1440&hei=810&qlt=85,0"),
        Vehiculos(placa = "P 1243", nombrepropietario = "Martha", marca = "Nissan", modelo = "2021", color = "Amarillo", imagen = "https://hackercar.com/wp-content/uploads/2019/09/nissan-juke-promocion.jpg"),
        Vehiculos(placa = "Q 1234", nombrepropietario = "Marcos", marca = "Mazda", modelo = "2020", color = "Azúl", imagen = "https://www.sinovinyl.com/wp-content/uploads/2020/08/CL-CG-12-5.jpg"),
        Vehiculos(placa = "S 5678", nombrepropietario = "Esther", marca = "Toyota", modelo = "2022", color = "Corinto", imagen = "https://www.toyota.com.gt/hubfs/rav4-2020-color-rojo-nueva.png"),
        Vehiculos(placa = "O 7890", nombrepropietario = "Rosa", marca = "Jeep", modelo = "2019", color = "Negro", imagen = "https://www.jeep.com.ar/content/dam/cross-regional/latam/jeep/es_ar/renegade/2019/sport-at/2019-ago/2019_1_renegade_Sport_Anti_Branco_Ambiente-ret.jpg.img.1440.jpg"),
        Vehiculos(placa = "P 0000", nombrepropietario = "Andy", marca = "Mitsubishi", modelo = "2022", color = "Blanco", imagen = "https://www.autofacil.es/wp-content/uploads/2021/05/mitsubishi-asx-2013.jpg"),
        Vehiculos(placa = "M 1111", nombrepropietario = "Vanesa", marca = "Izuzu", modelo = "2021", color = "Verde", imagen = "https://cdn.automoto.cr/images/0005556_612.jpeg"),
        Vehiculos(placa = "T 5555", nombrepropietario = "Henry", marca = "Mazda", modelo = "2019", color = "Rosado", imagen = "https://www.sinovinyl.com/wp-content/uploads/2020/04/CL-SV-11-3-1.jpg")
    )

    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerVehiculos = findViewById<RecyclerView>(R.id.recycler_vehiculos)
        var adaptador = Adaptador2(vehiculos)
        recyclerVehiculos.layoutManager = LinearLayoutManager( this)
        recyclerVehiculos.adapter = adaptador


    }
}