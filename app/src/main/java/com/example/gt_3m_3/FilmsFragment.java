package com.example.gt_3m_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gt_3m_3.databinding.FragmentFilmsBinding;

import java.util.ArrayList;

public class FilmsFragment extends Fragment {
    private RecyclerView recyclerView;

    private ArrayList<String> films = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_films, container, false);

        // Add the following lines to create RecyclerView
        recyclerView = view.findViewById(R.id.rec_view_films);
        loadData();
        FilmAdapter adapter = new FilmAdapter(films);
        recyclerView.setAdapter(adapter);

        return view;


//        return inflater.inflate(R.layout.fragment_films, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void loadData() {
        films.add("Citizen Kane");
        films.add("Casablanca");
        films.add("The Wizard Of Oz");
        films.add("Singin In The Rain");
        films.add("Star Wars");
        films.add("2001: A Space Odyssey");
        films.add("Psycho");
        films.add("King Kong");
        films.add("Annie Hall");
        films.add("M*A*S*H");
        films.add("Lion King");
    }
}