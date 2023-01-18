package com.example.gt_3m_3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class GamesFragment extends Fragment {
    
    private RecyclerView recyclerView;
    private ArrayList<String> games =  new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_games, container, false);
        
        recyclerView = view.findViewById(R.id.rec_view_games);
        loadData();
        GameAdapter adapter = new GameAdapter(games);
        recyclerView.setAdapter(adapter);
        return view;
//        return inflater.inflate(R.layout.fragment_games, container, false);
    }

    private void loadData() {
        games.add("RDR2");
        games.add("GTA5");
        games.add("Spider man");
        games.add("CS-GO");
        games.add("Dota(");
        games.add("Assassins");
        games.add("Tetris");
        games.add("Tic Tac Toe");
    }
}