package com.example.latihan5;

public class FilmModel {
    String namaFilm;
    int gambarFilm;

    public FilmModel(String namaFilm, int gambarFilm){
        this.namaFilm = namaFilm;
        this.gambarFilm = gambarFilm;
    }
    public String getNamaFilm() {
        return namaFilm;
    }

    public int getGambarFilm() {
        return gambarFilm;
    }

}
