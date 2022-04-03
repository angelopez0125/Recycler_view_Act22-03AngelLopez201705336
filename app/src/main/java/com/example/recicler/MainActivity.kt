package com.example.recicler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplorecyclerview22mar22.Adaptador

class MainActivity : AppCompatActivity() {
    var persona= listOf<Personas>(
        Personas(codigo = "1", nombre = "Harry", apelido = "Potter", telefono = "67876786", imagen = "https://as01.epimg.net/epik/imagenes/2020/04/09/portada/1586422290_149950_1586423504_noticia_normal.jpg"),
        Personas(codigo = "2", nombre = "Peter", apelido = "Parker", telefono = "43324433", imagen = "https://i0.wp.com/wipy.tv/wp-content/uploads/2020/05/cicatriz-de-peter-parker-en-spider-man-3-1.jpg?fit=1000%2C600&ssl=1"),
        Personas(codigo = "3", nombre = "Michael", apelido = "Jordan", telefono = "32434234", imagen = "https://www.biografiasyvidas.com/biografia/j/fotos/jordan_michael_1.jpg"),
        Personas(codigo = "4", nombre = "Marilyn", apelido = "Monroe", telefono = "342423444", imagen = "https://media.vogue.mx/photos/617a976a530d745b9ecd4741/2:3/w_2560%2Cc_limit/GettyImages-517397806.jpg"),
        Personas(codigo = "5", nombre = "Katy", apelido = "Perry", telefono = "234123121", imagen = "https://media.vogue.mx/photos/5eeb4a2e7e00038f7ed10c38/2:3/w_2560%2Cc_limit/la-cantante-katy-perry.jpg"),
        Personas(codigo = "6", nombre = "Ariana", apelido = "Grande", telefono = "341431212", imagen = "https://studiosol-a.akamaihd.net/uploadfile/letras/fotos/d/6/b/8/d6b8d1be4b02ee8049c21885985f6c3b.jpg"),
        Personas(codigo = "7", nombre = "Clark", apelido = "Kent", telefono = "45432453", imagen = "https://blogdesuperheroes.es/imagen-noti/17445_big-400x300.jpg"),
        Personas(codigo = "8", nombre = "Bruce", apelido = "Baner", telefono = "23413411", imagen = "https://gcdn.lanetaneta.com/wp-content/uploads/2021/11/Marvel-confirma-por-que-Bruce-Banner-ya-no-es-Smart-Hulk.jpg"),
        Personas(codigo = "9", nombre = "Mario", apelido = "Bros", telefono = "3424143141", imagen = "https://i0.wp.com/imagenesparapeques.com/wp-content/uploads/2021/05/Mario-Bros-png-transparente.png?ssl=1"),
        Personas(codigo = "10", nombre = "Buzz", apelido = "Lightyear", telefono = "34124134124", imagen = "https://www.cinemascomics.com/wp-content/uploads/2020/08/buzz-lightyear-toy-Story.jpg")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerPersona = findViewById<RecyclerView>(R.id.recycler_personas)
        var adaptador = Adaptador(persona)
        recyclerPersona.layoutManager = LinearLayoutManager( this)
        recyclerPersona.adapter = adaptador


    }
}