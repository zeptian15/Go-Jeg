package com.example.go_jeg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends AppCompatActivity implements View.OnClickListener{
    private ImageButton btnGofood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnGofood = (ImageButton) findViewById(R.id.btn_gofood);
        btnGofood.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent goFood = new Intent(Home.this, GoFood.class);
        startActivity(goFood);
    }
}
