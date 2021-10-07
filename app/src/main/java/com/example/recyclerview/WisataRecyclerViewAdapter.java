package com.example.recyclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WisataRecyclerViewAdapter extends RecyclerView.Adapter<WisataRecyclerViewAdapter.MoviesViewHolder> {
    ArrayList<Wisata> arrayListWisata;

    public WisataRecyclerViewAdapter(ArrayList<Wisata> arrayListWisata) {
        this.arrayListWisata = arrayListWisata;
    }

    @NonNull
    @Override
    public WisataRecyclerViewAdapter.MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MoviesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WisataRecyclerViewAdapter.MoviesViewHolder holder, int position) {
        final Wisata wisata = arrayListWisata.get(position);

        holder.textViewTitle.setText(wisata.getTitle());
        holder.textViewKota.setText(wisata.getKota());
        holder.textViewProvinsi.setText(wisata.getProvinsi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailWisataActivity.class);
                intent.putExtra("WISATA", wisata);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListWisata.size();
    }

    public class MoviesViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle, textViewKota, textViewProvinsi;
        public MoviesViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.Wisata);
            textViewKota = itemView.findViewById(R.id.Kota);
            textViewProvinsi = itemView.findViewById(R.id.Provinsi);
        }
    }
}
