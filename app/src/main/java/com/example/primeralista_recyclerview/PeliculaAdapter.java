package com.example.primeralista_recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter {

    private List<Pelicula> listaPeliculas;

    public PeliculaAdapter(List<Pelicula> listaPeliculas){
        this.listaPeliculas = listaPeliculas;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflador = LayoutInflater.from(viewGroup.getContext());
        View view = inflador.inflate(R.layout.celda_items, viewGroup, false);
        PeliculaViewHolder peliculaViewHolder = new PeliculaViewHolder(view);
        return peliculaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Pelicula unaPeliculaDeLalista = this.listaPeliculas.get(i);
        PeliculaViewHolder peliculaViewHolder = (PeliculaViewHolder) viewHolder;
        peliculaViewHolder.bindPelicula(unaPeliculaDeLalista);

    }

    @Override
    public int getItemCount() {
        return this.listaPeliculas.size();
    }

    private class PeliculaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imagenListaItem;
        private TextView tituloPelicula;
        private TextView generoPelicula;
        private Pelicula peliculaDelItem;

        public PeliculaViewHolder(@NonNull View itemView) {
            super(itemView);
            imagenListaItem = itemView.findViewById(R.id.imagenListaItems);
            tituloPelicula = itemView.findViewById(R.id.tituloItemTextView);
            generoPelicula = itemView.findViewById(R.id.generoItemTextView);
        }

        public void bindPelicula (Pelicula peliculaDelItem) {
            this.peliculaDelItem = peliculaDelItem;
            this.tituloPelicula.setText(this.peliculaDelItem.getTituloPelicula());
            this.generoPelicula.setText(this.peliculaDelItem.getGeneroPelicula());
            this.imagenListaItem.setImageResource(this.peliculaDelItem.getImagenPelicula());
        }


    }



}
