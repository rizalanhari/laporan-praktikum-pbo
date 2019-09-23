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
public class Celana1841720218Rizal {
    private String mMerk;
    private int mHarga;

    public Celana1841720218Rizal() {
    }

    public String getmMerk() {
        return mMerk;
    }

    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }

    public int getmHarga() {
        return mHarga;
    }

    public void setmHarga(int mHarga) {
        this.mHarga = mHarga;
    }
    
    public int hitungHargaCelana(int mDiskon){
        return mHarga-(mHarga*mDiskon/100);
    }
}
