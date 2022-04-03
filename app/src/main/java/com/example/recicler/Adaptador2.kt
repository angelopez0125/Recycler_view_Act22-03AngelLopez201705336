package com.example.recicler

import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recicler.Personas
import com.example.recicler.R

import com.squareup.picasso.Picasso

class  Adaptador2(val vehiculos:List<Vehiculos>):RecyclerView.Adapter<Adaptador2.AdaptadorPersonalizado>() {

    //cargando los datos que vienen del array

    class AdaptadorPersonalizado(val view:View):RecyclerView.ViewHolder(view){
        //enlazar el adaptador con los elemento de la vista (cardview)
        val tvPlaca: TextView = view.findViewById(R.id.tv_placa)
        val tvNombrepropietario: TextView = view.findViewById(R.id.tv_nombrepropietario)
        val tvMarca: TextView = view.findViewById(R.id.tv_marca)
        val tvColor: TextView = view.findViewById(R.id.tv_color)
        val tvModelo: TextView = view.findViewById(R.id.tv_modelo)
        val image: ImageView = view.findViewById(R.id.iv_item)

        fun cargar(vehiculos:Vehiculos){
            tvPlaca.text = vehiculos.placa
            tvNombrepropietario.text = vehiculos.nombrepropietario
            tvMarca.text = vehiculos.marca
            tvColor.text = vehiculos.color
            tvModelo.text= vehiculos.modelo
            Picasso.get().load(vehiculos.imagen).into(image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptadorPersonalizado {
        val layoutInflater = LayoutInflater.from(parent.context)
        return  AdaptadorPersonalizado(layoutInflater.inflate(R.layout.cardview_layout,parent,false))
    }

    override fun onBindViewHolder(holder: AdaptadorPersonalizado, position: Int) {
        holder.cargar(vehiculos[position])
    }

    //establecer la cantidad de elementos del array
    override fun getItemCount(): Int = vehiculos.size
}