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
public class KeretaApi1841720218Rizal {
    private String mNama;
    private String mKelas;
    private Pegawai1841720218Rizal masinis;
    private Pegawai1841720218Rizal asisten;

    public KeretaApi1841720218Rizal(String mNama, String mKelas, Pegawai1841720218Rizal masinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.masinis = masinis;
    }

    public KeretaApi1841720218Rizal(String mNama, String mKelas, Pegawai1841720218Rizal masinis, Pegawai1841720218Rizal asisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getmNamaRizal() {
        return mNama;
    }

    public void setmNamaRizal(String mNama) {
        this.mNama = mNama;
    }

    public String getmKelasRizal() {
        return mKelas;
    }

    public void setmKelasRizal(String mKelas) {
        this.mKelas = mKelas;
    }

    public Pegawai1841720218Rizal getMasinisRizal() {
        return masinis;
    }

    public void setMasinisRizal(Pegawai1841720218Rizal masinis) {
        this.masinis = masinis;
    }

    public Pegawai1841720218Rizal getAsistenRizal() {
        return asisten;
    }

    public void setAsistenRizal(Pegawai1841720218Rizal asisten) {
        this.asisten = asisten;
    }
    
    public String infoRizal() {
        String info = "";
        info += "Nama: " + this.mNama + "\n";
        info += "Kelas: " + this.mKelas + "\n";
        info += "Masinis: " + this.masinis.infoRizal() + "\n";
        info += "Asisten: " + this.asisten.infoRizal() + "\n";
        return info;
    }
}
