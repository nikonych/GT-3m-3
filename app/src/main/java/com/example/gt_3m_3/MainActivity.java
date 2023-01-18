package com.example.gt_3m_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.gt_3m_3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().add(R.id.container, new FilmsFragment(), "film_fragment").commit();

        binding.btnNext.setOnClickListener(view -> {
            FilmsFragment filmsFragment = (FilmsFragment) getSupportFragmentManager().findFragmentByTag("film_fragment");
            GamesFragment gamesFragment = (GamesFragment) getSupportFragmentManager().findFragmentByTag("game_fragment");
            FoodsFragment foodsFragment = (FoodsFragment) getSupportFragmentManager().findFragmentByTag("food_fragment");
            if(filmsFragment != null && filmsFragment.isVisible()) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new GamesFragment(), "game_fragment").commit();
            } else if(gamesFragment != null && gamesFragment.isVisible()) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new FoodsFragment(), "food_fragment").commit();
            } else if(foodsFragment != null && foodsFragment.isVisible()) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new FilmsFragment(), "film_fragment").commit();
            }
        });
    }
}