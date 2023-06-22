package com.xyz.exampleapp1.java;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.xyz.exampleapp1.R;


public class ViewAnimalActivity extends AppCompatActivity {

  RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_item);
    }
}