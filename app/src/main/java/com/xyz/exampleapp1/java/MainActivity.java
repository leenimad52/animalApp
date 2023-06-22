package com.xyz.exampleapp1.java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xyz.exampleapp1.java.Model.Animal;
import com.xyz.exampleapp1.java.Model.RecyclerViewAdapter;
import com.xyz.exampleapp1.R;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
  RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rv_main);
         ArrayList<Animal> cardDataList = listData();
         RecyclerView recyclerView = findViewById(R.id.rv_main);
          recyclerView.setLayoutManager(new LinearLayoutManager(this));
           RecyclerViewAdapter adapter = new RecyclerViewAdapter(cardDataList);
            recyclerView.setAdapter(adapter);
    }
    ////////////////////////////////////////////////////
    private ArrayList<Animal> listData() {
        ArrayList<Animal> animalList = new ArrayList<>();
        SharedPreferences sharedPreferences = getSharedPreferences("MyCards", Context.MODE_PRIVATE);
        animalList.add(new Animal(R.drawable.lion,"Lion", "Grasslands", "Carnivore", "Social", "Lions live in prides."));
        animalList.add(new Animal(R.drawable.elph,"Elephant", "Forests", "Herbivore", "Family-oriented", "Elephants are the largest land mammals."));
        animalList.add(new Animal(R.drawable.grif,"Giraffe", "Savannah", "Herbivore", "Tall-necked", "Giraffes have long necks and legs."));
        animalList.add(new Animal(R.drawable.panda,"Panda", "Mountains", "Herbivore", "Bamboo lover", "Pandas are native to China."));
        animalList.add(new Animal(R.drawable.monkey, "Monkey", "Jungle", "Omnivore", "Tree Swingers", "Monkeys are highly intelligent primates."));
        animalList.add(new Animal(R.drawable.rabbit, "Rabbit", "Fields", "Herbivore", "Fast Breeder", "Rabbits are small mammals known for their long ears and hopping gait."));
        return animalList;
    }
    /////////////////////////////




}