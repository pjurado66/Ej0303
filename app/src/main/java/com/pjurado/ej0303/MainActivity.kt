package com.pjurado.ej0303

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private var myAdapter: MyAdapter? = null
    private val destinos = ArrayList<Destino>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        creaDatos()
        val myRecyclerView = findViewById(R.id.recyclerView) as RecyclerView
        myRecyclerView.setHasFixedSize(true)
        val gridLayoutManager = GridLayoutManager(this, 2)
        myRecyclerView.setLayoutManager(gridLayoutManager)
        myAdapter = MyAdapter(destinos, this)
        myRecyclerView.setAdapter(myAdapter)
    }

    private fun creaDatos() {
        destinos.add(Destino("Ainsa", R.drawable.ainsa, 42.416072, 0.140167))
        destinos.add(Destino("Baeza", R.drawable.baeza, 38.006540, -3.467137))
        destinos.add(Destino("Cazorla", R.drawable.cazorla, 37.924696, -3.005119))
        destinos.add(Destino("Combarro", R.drawable.combarro, 42.431787, -8.706848))
        destinos.add(Destino("Lanuza", R.drawable.lanuza, 42.756260, -0.315509))
        destinos.add(Destino("Llanes", R.drawable.llanes, 43.422110, -4.755946))
        destinos.add(Destino("Ordesa", R.drawable.ordesa, 42.679710, 0.035889))
        destinos.add(Destino("Santillana", R.drawable.santillana, 43.388797, -4.107570))
        destinos.add(Destino("Sos del Rey Catolico", R.drawable.sos, 42.494274, -1.216101))
        destinos.add(Destino("Ubeda", R.drawable.ubeda, 38.016433, -3.368465))
    }
}