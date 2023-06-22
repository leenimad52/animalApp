package com.xyz.exampleapp1.java.Model;

public class Animal {
    private int image;
    private String name;
    private String habitat;
    private String diet;
    private String behavior;
    private String funFacts;

    public Animal(int image, String name, String habitat, String diet, String behavior, String funFacts) {
        this.image = image;
        this.name = name;
        this.habitat = habitat;
        this.diet = diet;
        this.behavior = behavior;
        this.funFacts = funFacts;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getFunFacts() {
        return funFacts;
    }

    public void setFunFacts(String funFacts) {
        this.funFacts = funFacts;
    }
}
