package com.example.lesson3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lesson3_4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.continent_container, new ContinentFragment()).commit();

    }
}