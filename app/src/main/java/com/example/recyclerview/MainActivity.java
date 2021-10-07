package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    WisataRecyclerViewAdapter adapter;
    //Membuat Sebuah ArrayList
    ArrayList<Wisata> objWisata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ////Mengambil recyclerView dari activity_main.xml Berdasarkan Id recyclerView
        recyclerView = findViewById(R.id.recyclerView);

        // Mengintput Data apa saja yang akan di tampilkan dengann array
        objWisata.add(new Wisata("Pantai Gondo Mayit", "Blitar", "Jawa Timur", "pantai ini merupakan salah satu pantai yang indah di Jawa Timur loh. Memang sih pantai ini tidak seindah pantai-pantai di Bali, Raja Ampat, ataupun pantai-pantai di Kepulauan Seribu, akan tetapi pantai pasir putih ini memiliki daya tariknya tersendiri dalam rupa lautan yang tidak berkarang (sehingga aman bagi kalian untuk berenang tanpa perlu takut menabrak karang)."));
        objWisata.add(new Wisata("Air terjun Madakaripura", "Probolinggo", "Jawa Timur", "tempat ini mungkin sudah kehilangan pesonanya bagi mereka yang tidak senang ketika mereka harus berjalan jauh. Akan tetapi, mereka yang telah membayar harga tersebut dapat menikmati pemandangan yang diberikan oleh air terjun setinggi 200 meter ini. Air terjun ini konon katanya merupakan tempat Patih Gajah Mada bermeditasi, sehingga air terjun ini memiliki nilai historis juga."));
        objWisata.add(new Wisata("Pantai Jonggring Saloko", "Malang ", "Jawa Timur", "Pantai yang terletak di daerah Malang ini memang tidak cocok untuk dijadikan tempat berenang karena banyaknya karang tajam yang berbahaya, tetapi jika kalian hanya datang ke pantai untuk melihat-lihat saja, kalian akan dihibur oleh putihnya pasir, jernihnya air laut, serta batu karang yang menjadi tontonan tersendiri. Pantai ini terletak cukup jauh dari kota Malang (sekitar 70 kilometer) dan merupakan salah satu pantai yang amat jarang dikunjungi karena letaknya yang sangat terisolasi."));
        objWisata.add(new Wisata("Taman nasional Meru Betiri", "perbatasan Jember dan Banyuwangi", "Jawa Timur", "Tempat ini merupakan suatu taman besar yang berisi banyak binatang-binatang eksotis. Binatang-binatang yang dapat kalian temui adalah kera ekor panjang, penyu, ajag (sejenis anjing hutan asli Indonesia), serta landak. Pecinta serangga pun dapat menemukan kumbang hitam dab berbagai jenis serangga lain di taman nasional ini. Pecinta tanaman juga tidak ketinggalan karena terdapat berbagai jenis tanaman langka seperti Raflesia Zollingeriana dan Balanophora Fungosa."));

        // kode untuk menampilkan data yang akan di tampilkan menggunakan adapter
        adapter = new WisataRecyclerViewAdapter(objWisata);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}