package com.example.gt_3m_3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FoodsFragment extends Fragment {
    
    private ArrayList<String> foods = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
        View view = inflater.inflate(R.layout.fragment_foods, container, false);
        // Inflate the layout for this fragment
        recyclerView = view.findViewById(R.id.rec_view_foods);
        loadData();
        FoodAdapter adapter = new FoodAdapter(foods);
        recyclerView.setAdapter(adapter);
        return view;
//        return inflater.inflate(R.layout.fragment_foods, container, false);
    }

    private void loadData() {
        foods.add("Tacos");
        foods.add("Poutine");
        foods.add("Chicken");
        foods.add("Som tam");
        foods.add("Seafood paella");
        foods.add("Potato chips");
        foods.add("Masala dosa");
        foods.add("Buttered popcorn");
        foods.add("Quinoa");
        foods.add("Goji Berries");
        foods.add("Brussels Sprouts");
        foods.add("Seafood paella");
        foods.add("Potato chips");
        foods.add("Masala dosa");
        foods.add("Buttered popcorn");
        foods.add("Quinoa");
        foods.add("Goji Berries");
        foods.add("Brussels Sprouts");
        foods.add("Seafood paella");
        foods.add("Potato chips");
        foods.add("Masala dosa");
        foods.add("Buttered popcorn");
        foods.add("Quinoa");
        foods.add("Goji Berries");
        foods.add("Brussels Sprouts");
    }
}