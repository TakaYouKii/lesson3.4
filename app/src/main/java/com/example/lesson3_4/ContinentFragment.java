package com.example.lesson3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson3_4.databinding.FragmentContinentBinding;

import java.io.Serializable;
import java.util.ArrayList;


public class ContinentFragment extends Fragment implements onItemClickListener{

    private FragmentContinentBinding binding;
    private ContinentAdapter continentAdapter;
    private ArrayList<Continent> continentList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        continentAdapter = new ContinentAdapter(continentList, this);
        binding.rvContinent.setAdapter(continentAdapter);

    }
    String[] northAmerica = {"https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Flag_of_Antigua_and_Barbuda.svg/1920px-Flag_of_Antigua_and_Barbuda.svg.png",
                            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/Flag_of_the_Bahamas.svg/1920px-Flag_of_the_Bahamas.svg.png",
                            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Flag_of_Barbados.svg/1920px-Flag_of_Barbados.svg.png",
                            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Flag_of_Belize.svg/1920px-Flag_of_Belize.svg.png",
                            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Flag_of_Haiti.svg/1920px-Flag_of_Haiti.svg.png",

            };

    String[] southAmerica = {"https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/1920px-Flag_of_Argentina.svg.png",
                            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Flag_of_Bolivia.svg/1280px-Flag_of_Bolivia.svg.png",
                            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/1280px-Flag_of_Brazil.svg.png",
                            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7b/Flag_of_Venezuela_%28state%29.svg/1920px-Flag_of_Venezuela_%28state%29.svg.png",
                            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Flag_of_Guyana.svg/1920px-Flag_of_Guyana.svg.png",

    };

    String[] africa = {"https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Flag_of_the_African_Union.svg/1920px-Flag_of_the_African_Union.svg.png",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Flag_of_the_East_African_Community.svg/1920px-Flag_of_the_East_African_Community.svg.png",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Flag_of_the_Arab_League.svg/1920px-Flag_of_the_Arab_League.svg.png",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Flag_of_OPEC.svg/1920px-Flag_of_OPEC.svg.png",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/OIC_Logo_since_2011.svg/1920px-OIC_Logo_since_2011.svg.png",

    };

    String[] eurasia = {"https://upload.wikimedia.org/wikipedia/commons/thumb/7/7a/Flag_of_the_Republic_of_Abkhazia.svg/480px-Flag_of_the_Republic_of_Abkhazia.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Germany.svg/1920px-Flag_of_Germany.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/480px-Flag_of_Kazakhstan.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/480px-Flag_of_Kyrgyzstan.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_France_%281794%E2%80%931815%2C_1830%E2%80%931974%2C_2020%E2%80%93present%29.svg/480px-Flag_of_France_%281794%E2%80%931815%2C_1830%E2%80%931974%2C_2020%E2%80%93present%29.svg.png",

    };

    String[] australia = {"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Flag_of_Australia.svg/1920px-Flag_of_Australia.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Flag_of_the_Australian_Capital_Territory.svg/1920px-Flag_of_the_Australian_Capital_Territory.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Flag_of_New_South_Wales.svg/1920px-Flag_of_New_South_Wales.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Flag_of_the_Northern_Territory.svg/1920px-Flag_of_the_Northern_Territory.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Flag_of_Queensland.svg/1920px-Flag_of_Queensland.svg.png",

    };


    private void loadData() {
        continentList.add(new Continent("Северная Америка", "https://w7.pngwing.com/pngs/606/693/png-transparent-world-map-americas-mapa-polityczna-north-america-monochrome-world-fictional-character.png", northAmerica));
        continentList.add(new Continent("Южная Америка", "https://w7.pngwing.com/pngs/273/145/png-transparent-south-america-united-states-subregion-map-united-states-cdr-monochrome-united-states.png",southAmerica));
        continentList.add(new Continent("Африка", "https://w7.pngwing.com/pngs/510/755/png-transparent-africa-map-graphy-africa-monochrome-world-black.png",africa));
        continentList.add(new Continent("Евразия", "https://img.freepik.com/premium-vector/eurasia-map-black-monochrome-shape-vector-illustration_266660-132.jpg",eurasia));
        continentList.add(new Continent("Австралия", "https://w7.pngwing.com/pngs/82/834/png-transparent-australia-map-australia-monochrome-world-road-map.png",australia));


    }

    @Override
    public void onItemClick(int position) {
        Continent continent = continentList.get(position);
        Bundle bundle = new Bundle();
        bundle.putSerializable("continent", continent);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.continent_container, countryFragment).addToBackStack(null).commit();
    }
}