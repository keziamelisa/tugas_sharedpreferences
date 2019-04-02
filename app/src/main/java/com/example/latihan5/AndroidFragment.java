package com.example.latihan5;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidFragment extends Fragment implements MainView {
    List<FilmModel> filmModels = new ArrayList<>();
    FilmAdapter adapter;


    public AndroidFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_android, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        adapter = new FilmAdapter(getContext(), filmModels);
        recyclerView.setAdapter(adapter);
        FilmData data = new FilmData(this,getContext());
        data.setData();
    }

    public void onSuccess(List<FilmModel> filmModels){
        this.filmModels.clear();
        this.filmModels.addAll(filmModels);
        this.adapter.notifyDataSetChanged();
    }
}


