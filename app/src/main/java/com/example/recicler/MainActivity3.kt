package com.example.recicler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplorecyclerview22mar22.Adaptador

class MainActivity3 : AppCompatActivity() {
    val productos= listOf<Productos>(
        Productos(codigo = "0101", nombre = "Harina", precio = "Q.20.00", imagen = "https://images.ecestaticos.com/Wo3fzb-NMNQqAGrSvdp1k5MGUXs=/0x109:2119x1301/1600x900/filters:fill(white):format(jpg)/f.elconfidencial.com%2Foriginal%2F6be%2F87b%2F448%2F6be87b448c2cf27ea55a994c163556d6.jpg"),
        Productos(codigo = "0102", nombre = "Frijol", precio = "Q.30.00", imagen = "https://www.eluniversal.com.mx/sites/default/files/2021/03/13/conoce_las_propiedades_de_los_frijoles_aires_de_campo.jpg"),
        Productos(codigo = "0103", nombre = "Arroz", precio = "Q.15.00", imagen = "https://cdn2.cocinadelirante.com/sites/default/files/styles/gallerie/public/images/2018/12/cuanto-arroz-necesito-cocinar-para-100-personas.jpg"),
        Productos(codigo = "0104", nombre = "Mosh", precio = "Q.5.00", imagen = "https://quaker.lat/app/uploads/sites/6/2020/04/Quaker-Avena-Mosh-900g-720x840.png"),
        Productos(codigo = "0105", nombre = "Granola", precio = "Q.100.00", imagen = "https://www.splenda.com/wp-content/themes/bistrotheme/assets/recipe-images/vanilla-cranberry-granola.jpg"),
        Productos(codigo = "0106", nombre = "Aceite", precio = "Q.200.00", imagen = "https://walmartgt.vtexassets.com/arquivos/ids/176977/Aceite-Ideal-Vegetal-Amarillo-300ml-1-26776.jpg?v=637607076855400000"),
        Productos(codigo = "0107", nombre = "Pasta", precio = "Q.30.00", imagen = "https://www.jessicagavin.com/wp-content/uploads/2020/07/how-to-cook-pasta-3-1200.jpg"),
        Productos(codigo = "0108", nombre = "Sal", precio = "Q.10.00", imagen = "https://www.lavanguardia.com/files/article_main_microformat/uploads/2019/09/17/5e99839c080be.jpeg"),
        Productos(codigo = "0109", nombre = "Mantequilla", precio = "Q.100.00", imagen = "https://www.cocinayvino.com/wp-content/uploads/2016/10/48713650_l-1200x675.jpg"),
        Productos(codigo = "0110", nombre = "Cereal", precio = "Q.200.00", imagen = "https://walmartgt.vtexassets.com/arquivos/ids/228221/Cereal-Kelloggs-Corn-Flakes-Bolsa-900gr-1-35526.jpg?v=637746719108800000"),
        Productos(codigo = "0111", nombre = "Avena", precio = "Q.90.00", imagen = "https://www.elmueble.com/medio/2019/08/25/copos-de-avena_d397fa3d_1200x630.jpg"),
        Productos(codigo = "0112", nombre = "Lentejas", precio = "Q.70.00", imagen = "https://www.lavanguardia.com/files/og_thumbnail/uploads/2018/11/23/5e99797c2b095.jpeg"),
        Productos(codigo = "0113", nombre = "Trigo", precio = "Q.30.00", imagen = "https://static.wixstatic.com/media/49bc02_806e015250ed44de9e6a7dc16af729ee~mv2.jpg/v1/fill/w_800,h_500,al_c,q_90/49bc02_806e015250ed44de9e6a7dc16af729ee~mv2.jpg"),
        Productos(codigo = "0114", nombre = "Azúcar", precio = "Q.100.00", imagen = "https://empresasiansa.cl/wp-content/uploads/2020/02/azucar.jpg"),
        Productos(codigo = "0115", nombre = "Detergente", precio = "Q.90.00", imagen = "https://walmartgt.vtexassets.com/arquivos/ids/249975/Detergente-L-quido-Ariel-Revitacolor-2-8-L-1-35269.jpg?v=637814001954700000"),

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) 
        var recyclerProductos = findViewById<RecyclerView>(R.id.recycler_productos)
        var adaptador = Adaptador3(productos)
        recyclerProductos.layoutManager = LinearLayoutManager( this)
        recyclerProductos.adapter = adaptador


    }
}