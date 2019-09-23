/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author RIZAL
 */
public class Pembeli1841720218Rizal {
    private String mNama;
    private Baju1841720218Rizal baju;
    private Celana1841720218Rizal celana;
    private Toko1841720218Rizal toko;
    private int mDiskon;

    public Pembeli1841720218Rizal() {
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public Baju1841720218Rizal getBaju() {
        return baju;
    }

    public void setBaju(Baju1841720218Rizal baju) {
        this.baju = baju;
    }

    public Celana1841720218Rizal getCelana() {
        return celana;
    }

    public void setCelana(Celana1841720218Rizal celana) {
        this.celana = celana;
    }

    public Toko1841720218Rizal getToko() {
        return toko;
    }

    public void setToko(Toko1841720218Rizal toko) {
        this.toko = toko;
    }

    public int getmDiskon() {
        return mDiskon;
    }

    public void setmDiskon(int mDiskon) {
        this.mDiskon = mDiskon;
    }
    
    public int hitungHargaTotal(){
        return celana.hitungHargaCelana(mDiskon)+baju.hitungHargaBaju(mDiskon);
    }
}
