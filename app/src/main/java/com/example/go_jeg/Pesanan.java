package com.example.go_jeg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pesanan extends AppCompatActivity implements View.OnClickListener{

    private TextView txtDetailPesanan;
    private Button btnSelesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);

        txtDetailPesanan = findViewById(R.id.txt_detail_pesanan);
        btnSelesai = findViewById(R.id.btn_selesai);

        Bundle pesanan = getIntent().getExtras();

        String Nama = pesanan.getString("Nama");
        String Alamat = pesanan.getString("Alamat");
        String Pesanan = pesanan.getString("Pesanan");

        txtDetailPesanan.setText("Nama : " + Nama + "\nAlamat : " + Alamat + "\nPesanan : " + Pesanan);

        btnSelesai.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent Home = new Intent(Pesanan.this, Home.class);
        startActivity(Home);
        finish();
    }
}
