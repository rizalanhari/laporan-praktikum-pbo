/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan4;

/**
 *
 * @author RIZAL
 */
public class Gerbong1841720218Rizal {
    private String mKode;
    private Kursi1841720218Rizal arrayKursi[];

    public Gerbong1841720218Rizal(String mKode, int mJumlah ) {
        this.mKode = mKode;
        this.arrayKursi = new Kursi1841720218Rizal[mJumlah];
        this.initKursiRizal();
    }
    
    private void initKursiRizal() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi1841720218Rizal(String.valueOf(i + 1));
        }
    }

    public String getmKodeRizal() {
        return mKode;
    }

    public void setmKodeRizal(String mKode) {
        this.mKode = mKode;
    }
    
    public void setPenumpangRizal(Penumpang1841720218Rizal penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpangRizal(penumpang);
    }

    public Kursi1841720218Rizal[] getArrayKursiRizal() {
        return arrayKursi;
    }

    public void setArrayKursiRizal(Kursi1841720218Rizal[] arrayKursi) {
        this.arrayKursi = arrayKursi;
    }
    
    public String infoRizal() {
        String info = "";
        info += "Kode: " + mKode + "\n";
        for (Kursi1841720218Rizal kursi : arrayKursi) {
            info += kursi.infoRizal();
        }
        return info;
    }
}
