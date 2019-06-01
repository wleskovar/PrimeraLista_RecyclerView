package com.example.primeralista_recyclerview;

public class Pelicula {

    private String tituloPelicula;
    private String generoPelicula;
    private Integer imagenPelicula;

    public Pelicula(){

    }

    public Pelicula(String tituloPelicula, String generoPelicula, Integer imagenPelicula) {
        this.tituloPelicula = tituloPelicula;
        this.generoPelicula = generoPelicula;
        this.imagenPelicula = imagenPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public void setGeneroPelicula(String generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public void setImagenPelicula(Integer imagenPelicula) {
        this.imagenPelicula = imagenPelicula;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public String getGeneroPelicula() {
        return generoPelicula;
    }

    public Integer getImagenPelicula() {
        return imagenPelicula;
    }
}
