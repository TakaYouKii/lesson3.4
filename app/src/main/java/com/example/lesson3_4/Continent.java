package com.example.lesson3_4;

import java.io.Serializable;

public class Continent implements Serializable {
    private String name;
    private String image;

    private String[] countries;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String[] getCountries() {
        return countries;
    }

    public void setCountries(String[] countries) {
        this.countries = countries;
    }

    public Continent(String name, String image, String[] countries) {
        this.name = name;
        this.image = image;
        this.countries = countries;
    }
}
