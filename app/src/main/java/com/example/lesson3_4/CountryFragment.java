package com.example.lesson3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.lesson3_4.databinding.FragmentCountryBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {

    private FragmentCountryBinding binding;

    private  CountryAdapter countryAdapter;

    private ArrayList<String[]> countries = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        countryAdapter = new CountryAdapter(countries);
        binding.rvContinent.setAdapter(countryAdapter);


    }

    private void loadData() {
        Continent continent =(Continent) getArguments().getSerializable("continent");
        for (int i = 0; i < continent.getCountries().length; i++) {
            countries.add(continent.getCountries());
        }
    }
}