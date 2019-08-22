package com.example.go_jeg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GoFood extends AppCompatActivity implements View.OnClickListener{

    private EditText edtNama;
    private EditText edtAlamat;
    private EditText edtPesanan;
    private Button btnPesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);

        edtNama = findViewById(R.id.edt_nama);
        edtAlamat = findViewById(R.id.edt_alamat);
        edtPesanan = findViewById(R.id.edt_pesanan);

        btnPesan = findViewById(R.id.btn_pesan);
        btnPesan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent pesanan = new Intent(GoFood.this, Pesanan.class);
        pesanan.putExtra("Nama", edtNama.getText().toString());
        pesanan.putExtra("Alamat", edtAlamat.getText().toString());
        pesanan.putExtra("Pesanan", edtPesanan.getText().toString());
        startActivity(pesanan);
    }
}
