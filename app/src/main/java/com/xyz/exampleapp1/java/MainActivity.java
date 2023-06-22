package com.xyz.exampleapp1.java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.xyz.exampleapp1.java.Model.Animal;
import com.xyz.exampleapp1.java.Model.RecyclerViewAdapter;
import com.xyz.exampleapp1.java.Model.animal2;
import com.xyz.exampleapp1.R;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

  RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rv_main);

//        ArrayList<animal2> animals=new ArrayList<>();
//        animals.add(new animal2(R.drawable.monkey,"monkey"));
//        animals.add(new animal2(R.drawable.tigerr,"tiger"));
//        animals.add(new animal2(R.drawable.one,"lee"));
//        RecyclerViewAdapter adapter=new RecyclerViewAdapter(animals);
//        RecyclerView.LayoutManager lm= new LinearLayoutManager(this);
//        rv.setHasFixedSize(true); //fixed size while the user use the app
//        rv.setLayoutManager(lm);
//        rv.setAdapter(adapter);

        DataFromSharedPreferences();
    }
    ////////////////////////////////////////////////////


    private List<Animal> DataFromSharedPreferences() {
        List<Animal> animalList = new ArrayList<>();

        SharedPreferences sharedPreferences = getSharedPreferences("MyCards", Context.MODE_PRIVATE);

        String card1Title = sharedPreferences.getString("card1_title", "");
        String card1Description = sharedPreferences.getString("card1_description", "");
        animalList.add(new Animal("Lion", "Grasslands", "Carnivore", "Social", "Lions live in prides."));
        String card2Title = sharedPreferences.getString("card2_title", "");
        String card2Description = sharedPreferences.getString("card2_description", "");
        animalList.add(new Animal("Elephant", "Forests", "Herbivore", "Family-oriented", "Elephants are the largest land mammals."));

        String card3Title = sharedPreferences.getString("card3_title", "");
        String card3Description = sharedPreferences.getString("card3_description", "");
        animalList.add(new Animal("Giraffe", "Savannah", "Herbivore", "Tall-necked", "Giraffes have long necks and legs."));

        return animalList;
    }
}