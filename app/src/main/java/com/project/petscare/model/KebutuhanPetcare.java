package com.project.petscare.model;

public class KebutuhanPetcare {
    //deklarasi field yang dibutuhkan
    public String namaProduk;
    public Integer hargaProduk;
    public Integer statusGambar;

    //constructor yang tidak memiliki argumen
    public KebutuhanPetcare(){}

    //constructor dengan argumen
    public KebutuhanPetcare(String namaProduk, Integer hargaProduk, Integer statusGambar){
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.statusGambar = statusGambar;
    }
}
