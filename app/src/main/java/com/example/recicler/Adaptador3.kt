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
class Adaptador3(val productos:List<Productos>):RecyclerView.Adapter<Adaptador3.AdaptadorPersonalizado>() {

    //cargando los datos que vienen del array
    class AdaptadorPersonalizado(val view:View):RecyclerView.ViewHolder(view){
        //enlazar el adaptador con los elemento de la vista (cardview)
        val tvCodigo: TextView = view.findViewById(R.id.tv_codigo)
        val tvNombre: TextView = view.findViewById(R.id.tv_nombre)
        val tvPrecio: TextView = view.findViewById(R.id.tv_precio)
        val imagen: ImageView = view.findViewById(R.id.iv_item)

        fun cargar(productos:Productos){
            tvCodigo.text = productos.codigo
            tvNombre.text = productos.nombre
            tvPrecio.text = productos.precio
            Picasso.get().load(productos.imagen).into(imagen)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptadorPersonalizado {
        val layoutInflater = LayoutInflater.from(parent.context)
        return  AdaptadorPersonalizado(layoutInflater.inflate(R.layout.cardview_layout,parent,false))
    }

    override fun onBindViewHolder(holder: AdaptadorPersonalizado, position: Int) {
        holder.cargar(productos[position])
    }

    //establecer la cantidad de elementos del array
    override fun getItemCount(): Int = productos.size
}