package com.example.recyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Wisata implements Parcelable {
    private String title;
    private String kota;
    private String provinsi;
    private String deskripsi;

    public Wisata(String title, String kota, String provinsi, String deskripsi) {
        this.title = title;
        this.kota = kota;
        this.provinsi = provinsi;
        this.deskripsi = deskripsi;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.kota);
        dest.writeString(this.provinsi);
        dest.writeString(this.deskripsi);
    }

    protected Wisata(Parcel in) {
        this.title = in.readString();
        this.kota = in.readString();
        this.provinsi = in.readString();
        this.deskripsi = in.readString();
    }

    public static final Parcelable.Creator<Wisata> CREATOR = new Creator<Wisata>() {
        @Override
        public Wisata createFromParcel(Parcel source) {
            return new Wisata(source);
        }

        @Override
        public Wisata[] newArray(int size) {
            return new Wisata[size];
        }
    };
}
