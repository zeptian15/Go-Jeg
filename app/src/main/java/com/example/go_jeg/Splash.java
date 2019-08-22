package com.example.go_jeg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {
    // Inisialisasi Waktu Splash
    private int waktu_loading = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        // Membuat Handler Baru
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Pindah ke Activity Lain setelah 4 Detik
                Intent home = new Intent(Splash.this, Home.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
    }
}
