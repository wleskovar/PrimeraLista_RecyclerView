package com.example.primeralista_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PeliculaAdapter.InformarSeleccion {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.listaRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        List<Pelicula> peliculas = new ArrayList<>();

        peliculas.add(new Pelicula("Batman","Accion",R.drawable.batman));
        peliculas.add(new Pelicula("Damages", "Drama", R.drawable.damages));
        peliculas.add(new Pelicula("Destroyer", "Drama", R.drawable.destroyer));
        peliculas.add(new Pelicula("El Juicio", "Drama", R.drawable.eljuicio));
        peliculas.add(new Pelicula("Inocente", "Drama", R.drawable.inocente));
        peliculas.add(new Pelicula("Intern", "Drama", R.drawable.intern));
        peliculas.add(new Pelicula("Jhon Wick 2", "Accion", R.drawable.johnwick2));
        peliculas.add(new Pelicula("King Kong", "Accion", R.drawable.kong));
        peliculas.add(new Pelicula("La Boda de mi Amigo", "Comedia", R.drawable.labodademi));
        peliculas.add(new Pelicula("Prometo", "Drama", R.drawable.prometo));
        peliculas.add(new Pelicula("Second", "Drama", R.drawable.second));
        peliculas.add(new Pelicula("The Good Doctor", "Drama", R.drawable.thegoogdoctor));

        PeliculaAdapter peliculaAdapter = new PeliculaAdapter(peliculas, this);
        recyclerView.setAdapter(peliculaAdapter);




    }

    @Override
    public void informarSeleccion(Pelicula pelicula) {
        Toast.makeText(this, "Hicieron click en "+pelicula.getTituloPelicula(), Toast.LENGTH_SHORT).show();

    }
}
