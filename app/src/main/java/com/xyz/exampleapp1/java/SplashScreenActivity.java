package com.xyz.exampleapp1.java;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.xyz.exampleapp1.R;

@SuppressLint("CustomSplashScreen")
public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Animation textAnimation = AnimationUtils.loadAnimation(this, R.anim.text_animation);
        Animation logoAnimation = AnimationUtils.loadAnimation(this, R.anim.logo_animation);

        TextView textViewTitle = findViewById(R.id.splash_title);
        ImageView imageViewLogo = findViewById(R.id.spash_logo);

        textViewTitle.setAnimation(textAnimation);
        imageViewLogo.setAnimation(logoAnimation);
        Handler handler = new Handler();
        handler.postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 2000);
    }
}