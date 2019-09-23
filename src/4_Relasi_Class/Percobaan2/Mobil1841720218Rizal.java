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
public class Mobil1841720218Rizal {
    private String mMerk;
    private int mBiaya;

    public Mobil1841720218Rizal() {
    }

    public String getmMerkRizal() {
        return mMerk;
    }

    public void setmMerkRizal(String mMerk) {
        this.mMerk = mMerk;
    }

    public int getBiayaRizal() {
        return mBiaya;
    }

    public void setBiayaRizal(int biaya) {
        this.mBiaya = biaya;
    }
    
    public int hitungBiayaMobilRizal(int hari){
        return mBiaya*hari;
    }
}
