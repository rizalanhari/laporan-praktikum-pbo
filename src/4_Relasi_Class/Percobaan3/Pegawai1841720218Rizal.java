/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3;

/**
 *
 * @author RIZAL
 */
public class Pegawai1841720218Rizal {
    private String mNip;
    private String mNama;

    public Pegawai1841720218Rizal(String mNip, String mNama) {
        this.mNip = mNip;
        this.mNama = mNama;
    }

    public String getmNipRizal() {
        return mNip;
    }

    public void setmNipRizal(String mNip) {
        this.mNip = mNip;
    }

    public String getmNamaRizal() {
        return mNama;
    }

    public void setmNamaRizal(String mNama) {
        this.mNama = mNama;
    }
    
    public String infoRizal() { 
        String info = "";
        info += "Nip: " + this.mNip + "\n";
        info += "Nama: " + this.mNama + "\n";
        return info;
    }

}
