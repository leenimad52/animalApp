package com.xyz.exampleapp1.java;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.xyz.exampleapp1.R;
import com.xyz.exampleapp1.java.Model.RecyclerViewAdapter;
import com.xyz.exampleapp1.java.Model.animal2;

import java.util.ArrayList;


public class ViewAnimalActivity extends AppCompatActivity {

  RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_item);
    }
}