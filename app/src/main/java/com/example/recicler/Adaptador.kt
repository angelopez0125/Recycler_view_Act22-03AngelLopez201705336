package com.example.ejemplorecyclerview22mar22

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

class Adaptador(val persona:List<Personas>):RecyclerView.Adapter<Adaptador.AdaptadorPersonalizado>() {

    //cargando los datos que vienen del array
    class AdaptadorPersonalizado(val view:View):RecyclerView.ViewHolder(view){
        //enlazar el adaptador con los elemento de la vista (cardview)
        val tvCodigo: TextView = view.findViewById(R.id.tv_codigo)
        val tvNombre: TextView = view.findViewById(R.id.tv_nombre)
        val tvApellido: TextView = view.findViewById(R.id.tv_apellido)
        val tvTelefono: TextView = view.findViewById(R.id.tv_telefono)
        val image: ImageView = view.findViewById(R.id.iv_item)

        fun cargar(persona:Personas){
            tvCodigo.text = persona.codigo
            tvNombre.text = persona.nombre
            tvApellido.text = persona.apelido
            Picasso.get().load(persona.imagen).into(image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptadorPersonalizado {
        val layoutInflater = LayoutInflater.from(parent.context)
        return  AdaptadorPersonalizado(layoutInflater.inflate(R.layout.cardview_layout,parent,false))
    }

    override fun onBindViewHolder(holder: AdaptadorPersonalizado, position: Int) {
        holder.cargar(persona[position])
    }

    //establecer la cantidad de elementos del array
    override fun getItemCount(): Int = persona.size
}