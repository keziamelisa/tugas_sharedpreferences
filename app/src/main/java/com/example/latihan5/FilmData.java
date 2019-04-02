package com.example.latihan5;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class FilmData {
    Context context;
    List<FilmModel> filmModels = new ArrayList<>();
    MainView view;
    public FilmData(MainView view,Context context){
        this.view=view;
        this.context=context;
    }

    public void setData(){
        FilmModel movie;
        movie= new FilmModel("Avengers: Infinity War", R.drawable.foto_avengers);
        filmModels.add(movie);
        movie= new FilmModel("Maze Runner: The Death Cure",R.drawable.foto_deathcure);
        filmModels.add(movie);
        movie= new FilmModel("Dilan 1991",R.drawable.foto_dilan);
        filmModels.add(movie);
        movie= new FilmModel("The Mortal Instruments",R.drawable.foto_imortal);
        filmModels.add(movie);
        movie= new FilmModel("Insidious",R.drawable.foto_insidious);
        filmModels.add(movie);
        movie= new FilmModel("Justin Bieber: Never Say Never",R.drawable.foto_jb);
        filmModels.add(movie);
        view.onSuccess(filmModels);
    }
}
