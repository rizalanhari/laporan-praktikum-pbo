/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author RIZAL
 */
public class Pelanggan1841720218Rizal {
    private String nama;
    private Mobil1841720218Rizal mobil;
    private Sopir1841720218Rizal sopir;
    private int hari;

    public Pelanggan1841720218Rizal() {
    }

    public String getNamaRizal() {
        return nama;
    }

    public void setNamaRizal(String nama) {
        this.nama = nama;
    }

    public Mobil1841720218Rizal getMobilRizal() {
        return mobil;
    }

    public void setMobilRizal(Mobil1841720218Rizal mobil) {
        this.mobil = mobil;
    }

    public Sopir1841720218Rizal getSopirRizal() {
        return sopir;
    }

    public void setSopirRizal(Sopir1841720218Rizal sopir) {
        this.sopir = sopir;
    }

    public int getHariRizal() {
        return hari;
    }

    public void setHariRizal(int hari) {
        this.hari = hari;
    }
    
    public int hitungBiayaTotalRizal(){
        return mobil.hitungBiayaMobilRizal(hari)+sopir.hitungBiayaSopirRizal(hari);
    }
}
