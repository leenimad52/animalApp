package com.xyz.exampleapp1.java;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.xyz.exampleapp1.R;

public class LoginActivity extends AppCompatActivity {
    private boolean flag = false;
    public static final String FLAG = "FLAG";
    private EditText user;
    public static final String NAME = "NAME";
    private EditText pass ;
    public static final String PASS = "PASS";
    private CheckBox checkBox;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = findViewById(R.id.txtUser);
        pass = findViewById(R.id.txtPassword);
        checkBox = findViewById(R.id.checkBox);
        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();

        if(flag){
            String name = sharedPreferences.getString(NAME, "");
            String password = sharedPreferences.getString(PASS, "");
            user.setText(name);
            pass.setText(password);
            checkBox.setChecked(true);
        }
    }
    public void btnLoginOnClick(View view) {
        String name = user.getText().toString();
        String password = pass.getText().toString();

        if(checkBox.isChecked()){
            if(!flag) {
                editor.putString(NAME, name);
                editor.putString(PASS, password);
                editor.putBoolean(FLAG, true);
                editor.commit();
            }
        }

        if(checkValues()==true){
            Toast.makeText(LoginActivity.this, "Please enter username and password!", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }

    public boolean checkValues()
    {
        if (TextUtils.isEmpty(user.getText()) || TextUtils.isEmpty(pass.getText())  ){
            return true;
        }
        else return false;
    }
}