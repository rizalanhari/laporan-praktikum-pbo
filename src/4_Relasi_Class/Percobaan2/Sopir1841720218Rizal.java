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
public class Sopir1841720218Rizal {
    private String mNama;
    private int mBiaya;

    public Sopir1841720218Rizal() {
    }

    public String getmNamaRizal() {
        return mNama;
    }

    public void setmNamaRizal(String mNama) {
        this.mNama = mNama;
    }

    public int getmBiayaRizal() {
        return mBiaya;
    }

    public void setmBiayaRizal(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
    public int hitungBiayaSopirRizal(int mHari){
        return mBiaya*mHari;
    }
}
