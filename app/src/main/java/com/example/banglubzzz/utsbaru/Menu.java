package com.example.banglubzzz.utsbaru;

/**
 * Created by BangLubzzz on 10/30/2017.
 */

public class Menu {

    private String nama;
    private String harga;
    private int thumbnail;

    public Menu() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Menu(String nama, String harga, int thumbnail) {
        this.nama = nama;
        this.harga = harga;
        this.thumbnail = thumbnail;
    }
}
