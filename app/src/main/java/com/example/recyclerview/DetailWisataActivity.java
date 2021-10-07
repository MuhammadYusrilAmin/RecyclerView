package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailWisataActivity extends AppCompatActivity {

    TextView textViewTitle, TextViewKota, TextViewProvinsi, textViewDeskripsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);

        // Mengambil TextView dari activity_detail_wisata.xml Berdasarkan Id TextView
        textViewTitle = findViewById(R.id.Wisata);
        TextViewKota = findViewById(R.id.Kota);
        TextViewProvinsi = findViewById(R.id.Provinsi);
        textViewDeskripsi = findViewById(R.id.deskripsiWisata);

        Wisata wisata = getIntent().getParcelableExtra("WISATA");
        textViewTitle.setText(wisata.getTitle());
        TextViewKota .setText(wisata.getKota());
        TextViewProvinsi .setText(wisata.getProvinsi());
        textViewDeskripsi.setText(wisata.getDeskripsi());
    }
}