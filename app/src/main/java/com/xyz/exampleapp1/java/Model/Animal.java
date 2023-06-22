package com.xyz.exampleapp1.java.Model;

public class Animal {
    private String name;
    private String habitat;
    private String diet;
    private String behavior;
    private String funFacts;

    public Animal(String name, String habitat, String diet, String behavior, String funFacts) {
        this.name = name;
        this.habitat = habitat;
        this.diet = diet;
        this.behavior = behavior;
        this.funFacts = funFacts;
    }

    public String getName() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDiet() {
        return diet;
    }

    public String getBehavior() {
        return behavior;
    }

    public String getFunFacts() {
        return funFacts;
    }
}
